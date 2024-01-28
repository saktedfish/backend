package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActionController {

    @GetMapping("actions")
    public String actions() {
        return "使用 GitHub Actions 部署至服务器";
    }
}