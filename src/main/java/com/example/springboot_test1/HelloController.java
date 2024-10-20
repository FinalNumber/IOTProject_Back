package com.example.springboot_test1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class HelloController {

    @GetMapping("/test")
    public String hello() {
        return "테스트 용으로 입력한거야 ㅇㅅㅇ.";
    }

}
