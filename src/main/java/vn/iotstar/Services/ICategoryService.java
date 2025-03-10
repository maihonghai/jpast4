package vn.iotstar.Services;

import java.util.List;

import vn.iotstar.entity.Category;

public interface ICategoryService {
	int count();

	List<Category> findAll(int page, int pagesize);

	List<Category> findByCategoryName(String catname);

	List<Category> findAll();

	Category findById(int cateid);

	void delete(int cateid) throws Exception;

	void update(Category category);

	void insert(Category category);

}
