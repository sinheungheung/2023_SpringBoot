package kr.hs.study.JDBC.service;

import kr.hs.study.JDBC.dto.myUserDTO;

import java.util.List;

public interface myUserService {
    public void insert(myUserDTO dto);

    public List<myUserDTO> listAll();
}
