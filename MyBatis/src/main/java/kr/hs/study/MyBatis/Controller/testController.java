package kr.hs.study.MyBatis.Controller;

import kr.hs.study.MyBatis.dto.myUserDTO;
import kr.hs.study.MyBatis.service.myUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class testController {
    @Autowired
    private myUserService service;

    @GetMapping("/add")
    public String add_form(){
        return "write_form";
    }

    @PostMapping("/write")
    public String write_form(myUserDTO dto){
        return "result_form";
    }
}
