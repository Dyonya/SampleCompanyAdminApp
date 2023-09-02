package com.admin.somecompany;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/")
    public String adminController() {
        return "draft computers info";
    }
}
