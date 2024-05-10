package com.binary;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class GreetingController {

    @GetMapping("/interest")
    public String showForm() {
        return "interestForm"; // The JSP with the form
    }
    @PostMapping("/select-interests")
    public ModelAndView selectInterests(@RequestParam("interests") List<String> interests) {
        ModelAndView modelAndView = new ModelAndView("interestList");
        modelAndView.addObject("selectedInterests", interests);
        return modelAndView;

    }
    @PostMapping("/nameDisplay")
    public ModelAndView selectUser(@RequestParam("username") String username) {
        ModelAndView modelAndView = new ModelAndView("userName");
        modelAndView.addObject("username", username);
        return modelAndView;
    }


    @GetMapping("/users")
    public ModelAndView userPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("userPage");
        return modelAndView;

    }

}
