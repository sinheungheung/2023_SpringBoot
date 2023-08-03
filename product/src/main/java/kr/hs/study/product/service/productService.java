package kr.hs.study.product.service;

import kr.hs.study.product.dto.product;
import org.springframework.stereotype.Service;

import java.util.List;


public interface productService {
    //insert
    public void insert(product dto);

    //select
    public List<product> listAll();

    //delete
    public void del_product(String id);

    //select 한개
    public product readOne(String id);

    //update
    public void update(product dto);

}
