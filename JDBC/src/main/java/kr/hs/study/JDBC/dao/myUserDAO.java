package kr.hs.study.JDBC.dao;

import kr.hs.study.JDBC.dto.myUserDTO;

import java.util.List;

public interface myUserDAO {
    // CURD 메서드 정의 (insert, update, delete, select)
    // insert, update, delete와 select의 차이점
    // return값이 있는지 없는지의 차이(select는 return값이 있다)

    // 1. 데이터 삽입
    public void insert(myUserDTO dto);

    // 2. 데이터 가져오기
    public List<myUserDTO> listAll();

    // 3. 데이터 수정

    // 4. 데이터 삭제

}
