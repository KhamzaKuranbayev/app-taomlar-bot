package repository;

import model.Category;

import java.sql.SQLException;
import java.util.List;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 1/6/2022
 * Time: 7:54 PM
 */
public interface CategoryRepository {

    Category findByName(String name) throws SQLException;

    boolean existsById(Long id) throws SQLException;

    void saveAll(List<Category> categories) throws SQLException;
}
