package com.study.shopping.web.session.controller;

import com.study.shopping.web.session.model.Session;
import com.study.shopping.web.session.model.SessionManager;
import com.study.shopping.web.session.view.LoginRequest;
import com.study.shopping.web.user.model.User;
import com.study.shopping.web.user.model.UserDao;
import com.study.shopping.web.user.view.UserView;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

@RestController
public class SessionController {
    private static final String SESSION_TOKEN = "session_token";
    private static final String USER_ID = "user_id";

    private UserDao userDao;
    private SessionManager sessionManager;

    public SessionController(UserDao userDao, SessionManager sessionManager) {
        this.userDao = userDao;
        this.sessionManager = sessionManager;
    }

    /**
     * 登录
     */
    @PostMapping("/session")
    public ResponseEntity login(HttpServletResponse response, @RequestBody LoginRequest request) {

        User user = userDao.getByName(request.getUsername());
        if (user == null || !user.getPassword().equals(request.getPassword())) {
            return new ResponseEntity(HttpStatus.UNAUTHORIZED);
        }

        // 添加session
        String token = UUID.randomUUID().toString();
        sessionManager.getSessions().put(user.getId(), new Session(user.getId(), token));

        //设置cookie
        response.addCookie(new Cookie(USER_ID, Long.toString(user.getId())));
        response.addCookie(new Cookie(SESSION_TOKEN, token));

        return new ResponseEntity(HttpStatus.CREATED);
    }

    /**
     * 登出
     */
    @DeleteMapping
    public ResponseEntity logout(@CookieValue(name = USER_ID, defaultValue = "0") long userId, @CookieValue(name = SESSION_TOKEN, defaultValue = "") String token) {
        Session session = sessionManager.getSessions().get(userId);

        if (session == null || !session.getToken().equals(token)) {
            return new ResponseEntity(HttpStatus.FORBIDDEN);
        }

        //删除session
        sessionManager.getSessions().remove(userId);

        return new ResponseEntity(HttpStatus.ACCEPTED);
    }

    /**
     * 获取当前用户
     */
    @GetMapping("/current")
    public ResponseEntity<UserView> current(@CookieValue(name = USER_ID, defaultValue = "0") long userId, @CookieValue(name = SESSION_TOKEN, defaultValue = "") String token) {
        Session session = sessionManager.getSessions().get(userId);
        if (session == null || !session.getToken().equals(token)) {
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }

        User user = userDao.getById(session.getUserId());

        return new ResponseEntity<>(new UserView(user.getId(), user.getName()), HttpStatus.OK);
    }

}
