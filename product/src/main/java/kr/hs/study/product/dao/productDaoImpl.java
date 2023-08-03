package kr.hs.study.product.dao;

import kr.hs.study.product.dto.product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public class productDaoImpl implements productDao{
    @Autowired
    private JdbcTemplate jdbc;
    @Override
    public void insert(product dto) {
        String sql="insert into product values(?,?)";
        jdbc.update(sql,dto.getProduct_id(),dto.getProduct_name());

    }

    @Override
    public List<product> listAll() {
        String sql="select * from product order by product_id desc";
        List<product> list = jdbc.query(sql,new BeanPropertyRowMapper<>(product.class));
        return list;
    }

    @Override
    public void del_product(String id) {
        String sql="delete from product where product_id=?";
        jdbc.update(sql, id);
    }

    @Override
    public product readOne(String id) {
        String sql="select * from product where product_id="+id;
        product dto= jdbc.queryForObject(sql,new BeanPropertyRowMapper<>(product.class));  //sql의 결과를 product클래스에 넣기
        return dto;
    }

    @Override
    public void update(product dto) { //진짜 update
        String sql="update product set product_name=? where product_id=?";
        jdbc.update(sql,dto.getProduct_name(),dto.getProduct_id());

    }

//    @Override
//    public void delete() {
//
//    }
}
