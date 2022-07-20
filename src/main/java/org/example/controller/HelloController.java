package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**

 * @Description: Controller包放控制器，此文件用来放第一个环境
 */
@RestController
@RequestMapping("/hello")
public class HelloController {


    @GetMapping("/hello")
    public String hello(){
        System.out.println("hello springboot !!!!");
        return "hello springboot";
    }
}



