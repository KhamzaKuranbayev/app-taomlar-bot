package service.impl;

import model.Cart;
import repository.CartRepository;
import repository.impl.CartRepositoryImpl;
import service.CartService;

import java.util.List;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 1/11/2022
 * Time: 7:20 PM
 */
public class CartServiceImpl implements CartService {
    public static CartRepository cartRepository = new CartRepositoryImpl();

    @Override
    public void save(Cart cart) {
        cartRepository.save(cart);
    }

    @Override
    public List<Cart> findAll() {
        return null;
    }

    @Override
    public Cart findById(Long id) {
        return null;
    }

    @Override
    public boolean existsByUserId(Long userId) {
        return cartRepository.existsByUserId(userId);
    }

    @Override
    public Cart findByUserId(Long userId) {
        return cartRepository.findByUserId(userId);
    }
}
