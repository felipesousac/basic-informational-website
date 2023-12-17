package com.basic.informationalsite.requests;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class Requests {

    @GetMapping("")
    public String index() {
        return "index";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/contact-me")
    public String contactMe() {
        return "contact-me";
    }
}
