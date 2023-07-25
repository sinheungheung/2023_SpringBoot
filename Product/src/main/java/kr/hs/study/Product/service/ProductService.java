package kr.hs.study.Product.service;

import kr.hs.study.Product.dto.ProductDTO;

public interface ProductService {
    // 상수와 추상메서드로 만들어진 것 => interface
    // insert
    public void insert(ProductDTO dto);
    // dto의 멤버변수에 들어있는 값을 데이터베이스의 Product 테이블에 추가하는 메서드

    // 삭제하는 메서드
    public void delete();

}
