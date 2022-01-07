package service;

import model.Product;

import java.sql.SQLException;
import java.util.List;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 1/6/2022
 * Time: 8:19 PM
 */
public interface ProductService {
    Product save(Product product);

    void saveAll(List<Product> products) throws SQLException;

    List<Product> findAll();

    Product findById(Long id);
}
