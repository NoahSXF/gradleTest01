package org.example.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 练习
 *
 * @BelongsProject: gradleTest01
 * @BelongsPackage: org.example.controller
 * @Author: Noah
 * @CreateTime: 2022-09-24  22:16
 * @Description: 练习
 * @Version: 1.0
 */
@RestController
@RequestMapping("/main")
public class MainController {
    @GetMapping("/do")
    public String getActorName() {
        return "ccc";
    }
}

