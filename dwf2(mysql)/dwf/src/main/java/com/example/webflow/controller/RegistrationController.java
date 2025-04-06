
package com.example.webflow.controller;

import com.example.webflow.model.User;
import com.example.webflow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.webflow.execution.Event;
import org.springframework.webflow.execution.RequestContext;

@Controller
public class RegistrationController {

    private final UserService userService;

    @Autowired
    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    public User initUser() {
        System.out.println("Initializing new user");
        return new User();
    }

    public Event saveUser(RequestContext context) {
        try {
            User user = (User) context.getFlowScope().get("user");
            System.out.println("Saving user: " + user);
            userService.saveUser(user);
            return new Event(this, "success");
        } catch (Exception e) {
            System.err.println("Error saving user: " + e.getMessage());
            e.printStackTrace();
            return new Event(this, "error");
        }
    }
}
