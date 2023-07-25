package kr.hs.study.Product.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class homeContoller {
    @GetMapping("/")
    public String home(){
        return "index";
    }
}
