package kr.hs.study.Product.service;

import kr.hs.study.Product.dao.ProductDAO;
import kr.hs.study.Product.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements  ProductService{
    @Autowired
    private ProductDAO dao;

    @Override
    public void insert(ProductDTO dto) {
    dao.insert(dto);
    }

    @Override
    public void delete() {

    }

}
