package com.study.shopping.user;

import com.study.shopping.user.model.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserControllerTest {

    @Test
    public void testGetUser() {
        assertEquals("test", new UserController().getUser());
    }
}
