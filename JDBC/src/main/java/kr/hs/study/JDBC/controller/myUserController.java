package kr.hs.study.JDBC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class myUserController {
    @GetMapping("/write")
    public String write_form(){
        return "write_form";
    }
}
