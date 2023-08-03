package kr.hs.study.MyBatis.mapper;

import kr.hs.study.MyBatis.dto.myUserDTO;
import org.apache.ibatis.annotations.Mapper;

// mapper: interface를 통해서 sql문을 호출
@Mapper
public interface  myUserMapper {

    public void insert(myUserDTO dto);
}
