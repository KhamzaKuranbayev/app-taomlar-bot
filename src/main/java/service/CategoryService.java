package service;

import model.Category;

import java.sql.SQLException;
import java.util.List;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 1/6/2022
 * Time: 7:51 PM
 */
public interface CategoryService {

    Category save(Category category);

    void saveAll(List<Category> categories) throws SQLException;

    List<Category> findAll();

    Category findById(Long id);

}
