package kr.hs.study.Product.dao;

import kr.hs.study.Product.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAOImpl implements ProductDAO{
    @Autowired
    private JdbcTemplate jdbc;

    @Override
    public void insert(ProductDTO dto) {
        // insert
        String sql="insert into product values(?,?)";
        jdbc.update(sql,dto.getProduct_id(), dto.getProduct_name());

        // update

        // delete
    }
}
