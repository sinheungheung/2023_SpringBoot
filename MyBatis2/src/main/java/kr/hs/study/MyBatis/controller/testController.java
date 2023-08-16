package kr.hs.study.MyBatis.controller;

import kr.hs.study.MyBatis.dto.myUserDTO;
import kr.hs.study.MyBatis.service.myUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class testController {
    @Autowired
    private myUserService service;

@GetMapping("/write")
    public String add_form() {
    return "write_form";
}

@PostMapping("/write")
    public String write(myUserDTO dto) {
      service.insert(dto);
      return "redirect:/";
}
@GetMapping("/")
    public String list(Model model) {
       List<myUserDTO> list=service.list();
    System.out.println("size:"+list.size());
    model.addAttribute("list",list);
       return "list";
}


}
