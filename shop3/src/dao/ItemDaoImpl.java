package dao;

import java.util.List;
import javax.sql.DataSource;

import logic.Item;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

public class ItemDaoImpl implements ItemDao {
	
	private SimpleJdbcTemplate template;
	
	public void setDataSource(DataSource dataSource){
		this.template = new SimpleJdbcTemplate(dataSource);
	}
	
	private static final String SELECT_ALL = "select item_id, item_name,price,description,picture_url from item order by item_id";
	

	@Override
	public List<Item> findAll() {
		// TODO Auto-generated method stub
		RowMapper<Item> mapper = new BeanPropertyRowMapper<Item>(Item.class);
		
		return this.template.query(ItemDaoImpl.SELECT_ALL, mapper);
	}


	private static final String SELECT_BY_PRIMARY_KEY = "SELECT item_id, item_name, price, description, picture_url FROM item WHERE item_id = ?";

	@Override
	public Item findByPrimaryKey(Integer itemId) {
		// TODO Auto-generated method stub
		RowMapper<Item> mapper = new BeanPropertyRowMapper<Item>(Item.class);
		return this.template.queryForObject(SELECT_BY_PRIMARY_KEY, mapper, itemId);
	}

}
