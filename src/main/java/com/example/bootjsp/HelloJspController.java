package com.example.bootjsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // Application이 스캔해서 dispatcher servlet에 등로해준다
public class HelloJspController {
    @GetMapping("/hello-jsp")
    public String helloJsp() {
        return "hello"; //hello.jsp 를 찾아감
    }

}
