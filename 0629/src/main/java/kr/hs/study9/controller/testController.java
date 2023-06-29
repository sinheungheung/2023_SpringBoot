package kr.hs.study9.controller;

import kr.hs.study9.dto.write;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class testController {
    @GetMapping("/")
    public String test(){
        return "index";
    }
    @GetMapping("/write")
    public String write(){
        return "write_form";
    }
    @PostMapping("/write_form")
    public String write_form(@ModelAttribute write t, Model model){
        model.addAttribute("title", t.getTitle());
        model.addAttribute("context", t.getContext());
        model.addAttribute("writer", t.getWriter());
        return "result";
    }


}
