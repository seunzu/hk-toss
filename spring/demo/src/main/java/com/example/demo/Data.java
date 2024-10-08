package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

// 클래스 위에 @Component 생성해서 bean 으로 관리

@Component
public class Data {

    public List<Student> list;

    public Data (Student student1) {
        this.list = new ArrayList<>();
        list.add(student1);
    }
}
