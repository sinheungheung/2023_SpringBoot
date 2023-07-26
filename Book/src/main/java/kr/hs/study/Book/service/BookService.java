package kr.hs.study.Book.service;

import kr.hs.study.Book.dto.BookDTO;

public interface BookService {
    public void insert(BookDTO dto);

    public void delete();
}
