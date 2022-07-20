package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//简单的程序使用这个注解
@EnableAutoConfiguration//作用，开启自动配置 初始化spring环境 springmvc环境
//怎么样让主类扫描到控制器呢？
@ComponentScan  //  作用：扫描相关注解 扫描范围是当前入口类所在的包及子包

public class LearnSpringApplication {
    public static void main(String[] args) {
        //springApplication spring应用类 作用：用来启动springboot应用
        //参数1：传入入口类 类对象 参数2：main函数的参数
        SpringApplication.run(LearnSpringApplication.class,args);


    }
}

/**
 * @EnableAutoConfiguration: 作用：开启自动配置 修饰范围：之呢个作用在类上
 *  //实际作用：根据依赖自动判断 如在第一个环境中引入了spring-boot-starter-web
 *          会自动根据引入的这个依赖构建相关环境 springmvc环境 web容器环境
 * @ComponetScan 作用：用来开启注解扫描 修饰范围：只能用在类上
 *                  扫描注解范围：默认当前包以及当前包下的子包
 * @RestController       //作用：用来实例化当前对象为一个控制器对象，并将类上所有方法的返回值转为json，响应浏览器
 * @Controller 实例化当前类为一个控制器+ @ResponseBody 用来将当前方法的返回值转为jon，响应给浏览器
 * @RequestMapping: 用来加入访问路径 修饰范围：类（加入统一命名空间）方法上（制定具体路径）
 *      @GetMapping 限定请求方式只能说get，并指定路径 修饰范围：方法上
 *      @PostMapping  @DeleteMapping @PutMapping
 * */
