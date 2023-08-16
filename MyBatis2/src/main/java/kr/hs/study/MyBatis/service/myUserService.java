package kr.hs.study.MyBatis.service;

import kr.hs.study.MyBatis.dto.myUserDTO;

import java.util.List;

public interface myUserService {
   public void insert(myUserDTO dto);
   public List<myUserDTO> list();
}
