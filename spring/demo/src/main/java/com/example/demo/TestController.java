package com.example.demo;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
 *  @ 간단한 annotation 을 사용 해주면서 구현을 숨기고 편히 사용할 수 있게 해 줌
 */

@Controller
public class TestController {
    String test2;
    Student student1;
    Data data;

    public TestController(String test2, Student student1, Data data) {
        this.test2 = test2;
        this.student1 = student1;
        this.data = data;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("list", data.list);
        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String postStudent(@RequestParam String name, @RequestParam Integer age) {
        Student student = new Student(name, age);
        data.list.add(student);
        return "redirect:/";
    }

    // localhost:8080/java
    @RequestMapping(value = "/java", method = RequestMethod.GET)
    public String java() {
        return "java";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "test";
    }

}
