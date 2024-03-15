package com.zinash.thymleafzinash.controllers;

import com.zinash.thymleafzinash.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloWorldController {

    @RequestMapping("/")
    public String home(){
        return "index";
    }
    @RequestMapping("/hello")
    public String helloWorld(Model model){
        model.addAttribute("message", "Hello World");
        return "helloworld";
    }

    @RequestMapping("/demo-style")
    public String helloCssAndJS(){
        return "css-js-demo";
    }

    @RequestMapping("/demo-bootstrap")
    public String helloBootstrap(){
        return "add-bootstrap";
    }

    @RequestMapping("/if-unless")
    public String helloIfUnless(Model model){

        List<User> userList = new ArrayList<>();

        User user1 = User.builder().id(1).firstName("Metages").lastName("Firheta").role("Manager").build();
        User user2 = User.builder().id(2).firstName("Zinash").lastName("Degefa").role("Employee").build();
        User user3 = User.builder().id(3).firstName("Barkot").lastName("Gashe").role("NA").build();

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        model.addAttribute("users", userList);
        return "if-unless";
    }

    @RequestMapping("/switch-case")
    public String switchCase(Model model){
        User user = User.builder().id(1).firstName("Metages").lastName("Firheta").role("Guest").build();
        model.addAttribute("user", user);
        return "switch-case";
    }
}
