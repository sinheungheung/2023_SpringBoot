package kr.hs.study.JDBC.controller;

import kr.hs.study.JDBC.dto.myUserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ResultController {
    @PostMapping("/write_form")
    public String result(@ModelAttribute myUserDTO r){
        System.out.println(r.getId());
        System.out.println(r.getName());
        return "result";
    }
}
