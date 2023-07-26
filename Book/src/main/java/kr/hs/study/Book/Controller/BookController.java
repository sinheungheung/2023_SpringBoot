package kr.hs.study.Book.Controller;

import kr.hs.study.Book.dto.BookDTO;
import kr.hs.study.Book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class BookController {

    @Autowired
    private BookService service;

    @GetMapping("/write")
    public String write_form() {
        return "write_form";
    }
    @PostMapping("/write_form")
    public String result_form(BookDTO dto) {
        // 콘솔에 찍기
        System.out.println(dto.getBook_id());
        System.out.println(dto.getBook_name());

    service.insert(dto);
    return  "result_form";

    }
}
