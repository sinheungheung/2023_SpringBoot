package kr.hs.study.MyBatis.service;

import kr.hs.study.MyBatis.dto.myUserDTO;
import kr.hs.study.MyBatis.mapper.myUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class myUserServiceImpl implements myUserService{
    @Autowired
    private myUserMapper mapper;

    @Override
    public void insert(myUserDTO dto) {
        mapper.insert(dto);

    }

    @Override
    public List<myUserDTO> list() {
        return mapper.list();
    }
}
