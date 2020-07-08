package com.lombre.board.springboot.web;

import com.lombre.board.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/api")
    public HelloResponseDto helloApi(@RequestParam String name,
                                        @RequestParam int amount) {

     HelloResponseDto result = new HelloResponseDto(name, amount);

     return result;
    }
}
