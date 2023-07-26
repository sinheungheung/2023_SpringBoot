package kr.hs.study.Book.service;

import kr.hs.study.Book.dao.BookDAO;
import kr.hs.study.Book.dto.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements  BookService{
    @Autowired
    private BookDAO dao;

    @Override
    public void insert(BookDTO dto){
        dao.insert(dto);
    }

    @Override
    public void delete(){

    }
}
