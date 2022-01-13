package service;

import model.OrderCart;

import java.util.List;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 1/11/2022
 * Time: 7:35 PM
 */
public interface OrderCartService {
    void save(OrderCart orderCart);

    List<OrderCart> findAll();

    OrderCart findById(Long id);

    OrderCart findByCartAndProduct(Long id, long productId);
}
