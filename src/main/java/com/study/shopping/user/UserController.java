package com.study.shopping.user;

import com.study.shopping.user.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/users")
public class UserController {

    //创建线程安全的map
    static Map<Long, User> users = Collections.synchronizedMap(new HashMap<>());


    @GetMapping("")
    public List<User> getUserList() {
        List<User> r = new ArrayList<>(users.values());
        return r;
    }

    @PostMapping("")
    public String createUser(@ModelAttribute User user) {
        users.put(user.getId(), user);
        return "success";
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return users.get(id);
    }


    @PutMapping("/{id}")
    public String updateUser(@PathVariable Long id, @ModelAttribute User user) {
        users.put(id, user);
        return "success";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id, @ModelAttribute User user) {
        users.remove(id);
        return "success";
    }
}
