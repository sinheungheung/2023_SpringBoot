package kr.hs.study.Product.Controller;

import kr.hs.study.Product.dto.ProductDTO;
import kr.hs.study.Product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class productController {
    @Autowired
    private ProductService service;


    @GetMapping("/write")
    public String write_form(){
        return "write_form";
    }
    @PostMapping("/write_form")
    // 사용자 입력값이 ProductDTO에 자동주입
    public String result( ProductDTO dto){
        //  사용자가 입력한 값이 자동으로 멤버변수에 setter메서드 이용해서 들어가게 됨
        System.out.println(dto.getProduct_id());
        System.out.println(dto.getProduct_name());

        // insert메소드 호출
        service.insert(dto);
        return "result";
    }


}
