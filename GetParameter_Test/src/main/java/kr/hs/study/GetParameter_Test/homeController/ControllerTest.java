package kr.hs.study.GetParameter_Test.homeController;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ControllerTest {
    @GetMapping("/test1")
    public String test(){
        return "test1";
    }
    @GetMapping("/test2")
        public String test2(HttpServletRequest req, Model model){
        String a = req.getParameter("data1");
        String b = req.getParameter("data2");
        // data1과 data2를 model에 넣는다
        model.addAttribute("data1", a);
        model.addAttribute("data2", b);

        return "test2";

    }
    @GetMapping("/test3/{a}/{b}")
    public String test3(@PathVariable String a,
                                  @PathVariable String b,
                                    Model model){

        model.addAttribute("data1", a);
        model.addAttribute("data2", b);

        return "test2";
    }

    @GetMapping("/test4")
    public String test4(@RequestParam int data1,
                                  @RequestParam int data2,
                        Model model){


        model.addAttribute("data1", data1);
        model.addAttribute("data2", data2);

        return "test2";

    }
}
