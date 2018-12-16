package com.study.shopping.web.session.model;

import com.study.shopping.web.session.model.Session;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class SessionManager {
    // user id -> session
    private HashMap<Long, Session> sessions = new HashMap<>();

    public HashMap<Long, Session> getSessions() {
        return sessions;
    }

    public void setSessions(HashMap<Long, Session> sessions) {
        this.sessions = sessions;
    }
}
