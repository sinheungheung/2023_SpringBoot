package kr.hs.study.JDBC.controller;

import kr.hs.study.JDBC.dto.myUserDTO;
import kr.hs.study.JDBC.service.myUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class myUserController {
    @Autowired
    private myUserService service; // 서비스 객체 생성

    @GetMapping("/write")
    public String write_form(){
        return "write_form";
    }
    @PostMapping("/write")
    public String write(myUserDTO dto){
        service.insert(dto);
        return "result";
    }
}
