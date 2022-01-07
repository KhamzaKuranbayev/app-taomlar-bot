package repository;

import model.Category;
import model.Product;

import java.sql.SQLException;
import java.util.List;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 1/6/2022
 * Time: 8:21 PM
 */
public interface ProductRepository {
    Product findByName(String name) throws SQLException;

    boolean existsById(Long id) throws SQLException;

    void saveAll(List<Product> products) throws SQLException;
}
