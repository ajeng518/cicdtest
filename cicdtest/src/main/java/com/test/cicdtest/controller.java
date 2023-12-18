package com.test.cicdtest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {
    @GetMapping("")
    public String joinMember() {
        return "hello.html";
    }
}
