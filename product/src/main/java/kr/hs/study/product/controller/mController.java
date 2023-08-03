package kr.hs.study.product.controller;

import kr.hs.study.product.dto.product;
import kr.hs.study.product.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class mController {
    @Autowired
    private productService service;

    @GetMapping("/")
    public String list(Model model){
        List<product> list = service.listAll();
        model.addAttribute("list1",list);
        return "list";
    }

    @GetMapping("/product")
    public String product(){
        return "product";
    }
    @PostMapping("/product")
    public String product_done(@ModelAttribute product dto){
        //사용자 입력값이 product(dto)에 자동주입됨
        System.out.println(dto.getProduct_id());
        service.insert(dto);
        return "redirect:/";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") String id){
        service.del_product(id);
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String update_form(@PathVariable("id") String id, Model model){
        product dto=service.readOne(id);
        model.addAttribute("dto", dto);
        System.out.println("dto"+dto);
        return "result";
    }

    @PostMapping("/update_done")
    public String update(product dto){
        service.update(dto);
        return "redirect:/";
    }






}
