package service.impl;

import model.Product;
import repository.ProductRepository;
import repository.impl.ProductRepositoryImpl;
import service.ProductService;

import java.sql.SQLException;
import java.util.List;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 1/6/2022
 * Time: 8:19 PM
 */
public class ProductServiceImpl implements ProductService {
    public static ProductRepository productRepository = new ProductRepositoryImpl();

    @Override
    public Product save(Product product) {
        return null;
    }

    @Override
    public void saveAll(List<Product> products) throws SQLException {
        productRepository.saveAll(products);
    }

    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public List<Product> findAllByCategoryId(long categoryId) {
        return productRepository.findAllByCategoryId(categoryId);
    }
}
