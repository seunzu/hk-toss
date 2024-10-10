package com.example.kiosk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController = @Controller + @ResponseBody
 */
@RestController
public class TestController {

//    @RequestMapping("/java")
//    @ResponseBody
    @GetMapping("/java")
    public String java() throws InterruptedException {
        Thread.sleep(1000);
        return "java";
    }

    // get 메소드로 /name으로 이름 출력
//    @RequestMapping(value = "/name")
//    @ResponseBody
    @GetMapping("/name")
    public String name() {
        return "name";
    }

}
