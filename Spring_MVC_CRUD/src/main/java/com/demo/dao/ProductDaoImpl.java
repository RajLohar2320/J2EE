package com.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.demo.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao{
	@Autowired
	private JdbcTemplate jdbcTemp;

	@Override
	public int insert(Product p) {
		return jdbcTemp.update("insert into product values(?,?)", new Object[] {p.getPid(), p.getDesc()});
	}

	@Override
	public List<Product> getAll() {
		List<Product> plist = jdbcTemp.query("select * from product", new RowMapper<Product>() {

			@Override
			public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
				Product p = new Product();
				p.setPid(rs.getInt(1));
				p.setDesc(rs.getString(2));
				return p;
			}
		});
		return plist;
	}

	@Override
	public Product getById(int id) {
		RowMapper<Product> rm = new RowMapper<Product>() {
			public Product mapRow(ResultSet rs, int num) throws SQLException {
				Product p = new Product(rs.getInt(1), rs.getString(2));
				return p;
			}
		};
		return jdbcTemp.queryForObject("select * from product where PRODID = ?", rm, id);
	}

	@Override
	public int updateById(Product p) {
		return jdbcTemp.update("update product set DESCRIP = ? where PRODID = ?", new Object[] {p.getDesc(), p.getPid()});
	}

	@Override
	public int deleteById(int id) {
		return jdbcTemp.update("delete from product where PRODID = ?", new Object[] {id});
	}
	
}
