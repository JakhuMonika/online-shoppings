package org.com.Shopping.Shoppings.dao;


import java.util.List;

import org.com.Shopping.Shoppings.dto.Category;


public interface CategoryDAO {
	
	List<Category> list();
	Category get(int id);

}
