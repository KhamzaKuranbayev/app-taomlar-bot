package repository;

import model.Cart;

import java.sql.SQLException;
import java.util.List;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 1/11/2022
 * Time: 7:20 PM
 */
public interface CartRepository {
    void save(Cart cart);
    List<Cart> findAll();
    Cart findById(Long id);

    Cart findByUserId(Long userId);

    boolean existsByUserId(Long userId);
}
