package repository;

import model.Cart;
import model.OrderCart;

import java.util.List;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 1/11/2022
 * Time: 7:20 PM
 */
public interface OrderCartRepository {
    void save(OrderCart orderCart);
    List<OrderCart> findAll();
    OrderCart findById(Long id);


    OrderCart findByCartAndProduct(Long id, long productId);
}
