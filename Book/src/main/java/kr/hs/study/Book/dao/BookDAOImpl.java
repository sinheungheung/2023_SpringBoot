package kr.hs.study.Book.dao;

import kr.hs.study.Book.dto.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDAOImpl implements  BookDAO {

    @Autowired
    private JdbcTemplate jdbc;
    @Override
    public void insert(BookDTO dto){
        String sql="insert into Book values(?,?)";
        jdbc.update(sql, dto.getBook_id(),dto.getBook_name());
    }
}
