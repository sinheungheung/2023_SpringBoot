package kr.hs.study.product.service;

import kr.hs.study.product.dao.productDao;
import kr.hs.study.product.dto.product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class productServiceImpl implements productService{
    @Autowired
    private productDao dao;

    @Override
    public void insert(product dto) {
        dao.insert(dto);
    }

    @Override
    public List<product> listAll() {
        return dao.listAll();
    }

    @Override
    public void del_product(String id) {
        dao.del_product(id);
    }

    @Override
    public product readOne(String id) {
        return dao.readOne(id);
    }

    @Override
    public void update(product dto) {
        dao.update(dto);
    }

//    @Override
//    public void delete() {
//
//    }
}
