package com.quiz.controller;

import com.quiz.entities.User;
import com.quiz.forms.UserForm;
import com.quiz.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {
    @Autowired
    private User user;
    @Autowired
    private UserService userService;
    @PostMapping("/register")
    public String registerUser(UserForm userForm) {
        user.setUsername(userForm.getUsername());
        // BcryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        // String encodedPassword = encoder.encode(userForm.getPassword());
        // user.setPassword(encodedPassword);
        user.setName(userForm.getName());
        user.setRole(userForm.getRole());
        user.setEmail(userForm.getEmail());
        user.setPhoneNumber(userForm.getPhoneNumber());
        user.setAbout(userForm.getAbout());
        userService.saveUser(user);
        return "redirect:/login";
    }
}
