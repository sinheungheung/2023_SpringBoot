package kr.hs.study.JDBC.dao;

import kr.hs.study.JDBC.dto.myUserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
// 인터페이스가 객체를 못 만들어서 여기에 구현
public class myUserDAOImpl  implements  myUserDAO{
    @Autowired
    JdbcTemplate jdbc;

    @Override
    public void insert(myUserDTO dto) {
        String sql="insert into myUser(id,name) values(?,?)";
        jdbc.update(sql, dto.getId(),dto.getName());
    }

    @Override
    public List<myUserDTO> listAll() {
        return null;
    }
}


