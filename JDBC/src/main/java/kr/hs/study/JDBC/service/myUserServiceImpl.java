package kr.hs.study.JDBC.service;

import kr.hs.study.JDBC.dao.myUserDAO;
import kr.hs.study.JDBC.dto.myUserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class myUserServiceImpl  implements  myUserService{
    @Autowired
    private myUserDAO dao; // 객체 만듦

    @Override
    public void insert(myUserDTO dto) {
    dao.insert(dto);
    }

    @Override
    public List<myUserDTO> listAll() {
        return null;
    }
}
