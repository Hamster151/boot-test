package pl.com.tg.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.com.tg.test.model.User;
import pl.com.tg.test.service.IUserService;

@RestController
public class ApplicationController {
    @Autowired
    private IUserService userService;

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable(name = "id") Long id){
        User result = userService.getUserById(id);
        return result;
    }
}
