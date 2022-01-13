package service;

import model.Cart;

import java.util.List;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 1/11/2022
 * Time: 7:19 PM
 */
public interface CartService {
    void save(Cart cart);
    List<Cart> findAll();
    Cart findById(Long id);

    Cart findByUserId(Long userId);

    boolean existsByUserId(Long lastSavedId);
}
