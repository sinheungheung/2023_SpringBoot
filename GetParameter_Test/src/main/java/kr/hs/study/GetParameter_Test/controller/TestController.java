package kr.hs.study.GetParameter_Test.controller;

import kr.hs.study.GetParameter_Test.dto.join;
import kr.hs.study.GetParameter_Test.dto.login;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TestController {
    // login 클릭 => 로그인 폼 (login.html)
    @GetMapping("/login")
    public String login_form(){
        return "login_form";
    }

        // id, pass값 가져와서 출력
//        @PostMapping("/login_form")
//        public String a(WebRequest req) {
//            String ID = req.getParameter("user_id");
//            String Pass = req.getParameter("user_pass");
//            System.out.println("user_id:" + ID);
//            System.out.println("user_pass:" + Pass);
//            return "result";
//        }
//        @PostMapping("/login_form")
//        // @requestParam으로 가져오기
//    public String re_login(@RequestParam String user_id, @RequestParam String user_pass){
//            System.out.println("user_id: "+user_id);
//            System.out.println("user_pass: "+user_pass);
//        return "result";
//        }
@PostMapping("/login_form")
// @ModelAttribute로 받는다 dto가 있어야한다
// dto -> 자바파일
    public String login_form(@ModelAttribute login log1){
        // login객체 log1을 만들고 사용자의 입력값을 멤버변수에 setMethod이용해서 자동주입

    System.out.println("id" + log1.getUser_id());
    System.out.println("password" + log1.getUser_pass());

    return "result";
}
@GetMapping("/Join Us")
    public String join_form(){
        return "join_form";
}
//@PostMapping("/join_form")
//    public String b(WebRequest req){
//        String ID = req.getParameter("user_id");
//        String Pass = req.getParameter("user_pass");
//        String Name = req.getParameter("user_name");
//        String Email = req.getParameter("user_email");
//        String Tel = req.getParameter("user_tel");
//        String Local = req.getParameter("user_local");
//
//    System.out.println("user_id: " + ID);
//    System.out.println("user_pass: " + Pass);
//    System.out.println("user_name: " + Name);
//    System.out.println("user_email: " + Email);
//    System.out.println("user_tel: " + Tel);
//    System.out.println("user_local: " + Local);
//
//    return "commit";
//}
@PostMapping("join_form")
    public String join_form(@RequestParam String user_id, @RequestParam String user_pass, @RequestParam String user_name, @RequestParam String user_email, @RequestParam String user_tel, @RequestParam String user_local){
    System.out.println("user_id: " + user_id);
    System.out.println("user_pass: " + user_pass);
    System.out.println("user_name: " + user_name);
    System.out.println("user_email: " + user_email);
    System.out.println("user_tel: " + user_tel);
    System.out.println("user_local: " + user_local);

    return "commit";
}
//
//@PostMapping("/join_form")
//    public String join_form(@ModelAttribute join join1){
//    System.out.println("id" + join1.getUser_id());
//    System.out.println("password" + join1.getUser_pass());
//    System.out.println("name" + join1.getUser_name());
//    System.out.println("email" + join1.getUser_email());
//    System.out.println("tel" + join1.getUser_tel());
//    System.out.println("local" + join1.getUser_local());
//
//    return "commit";
//}
    }

