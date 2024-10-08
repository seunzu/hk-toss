package com.example.demo;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 컨트롤러: 유저가 보는 곳
 * @ annotation
 * request: 유저가 요청 하는 것
 * response: 우리가 유저에게 주는 것
 * localhost:8080/
 * web server: 내 컴퓨터에 http 통신 접근할 수 있게 도와주는 것
 * was(web application server): 내 컴퓨터에 http 통신 접근할 수 있게 해주고 코드를 돌리는 것
 * ㄴreact: node, spring: tomcat
 * spring framework vs. spring boot
 * main (x) / main (o)
 * spring framework web을 만들면 java 실행 x tomcat 실행
 * 설정할게 많음 (xml)
 */
@Controller
public class TestController {

    @RequestMapping
    public String index(HttpServletRequest request) {
        System.out.println(request.getRemoteAddr());
        return "index";
    }

    // localhost:8080/java
    @RequestMapping(value = "/java", method = RequestMethod.GET)
    public String java() {
        return "java";
    }

}
