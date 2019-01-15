package org.com.Shopping.Shoppings.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.com.Shopping.Shoppings.dao.CategoryDAO;
import org.com.Shopping.Shoppings.dto.Category;
import org.springframework.stereotype.Repository;

@Repository("categoryDao")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();

	static {
		// first category
		Category category = new Category();
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is a description for television");
		category.setImageURL("cat.png");

		categories.add(category);

		// second category
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is a description for mobile");
		category.setImageURL("cat1.png");

		categories.add(category);

		// third category
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is a description for laptop");
		category.setImageURL("cat2.png");

		categories.add(category);
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		// enhanced for loop

		for (Category category : categories) {
			if (category.getId() == id)
				return category;
		}

		return null;

	}

}
