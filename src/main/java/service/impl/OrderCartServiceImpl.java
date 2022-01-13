package service.impl;

import model.OrderCart;
import repository.OrderCartRepository;
import repository.impl.OrderCartRepositoryImpl;
import service.OrderCartService;

import java.util.List;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 1/11/2022
 * Time: 7:36 PM
 */
public class OrderCartServiceImpl implements OrderCartService {
    public static OrderCartRepository orderCartRepository = new OrderCartRepositoryImpl();

    @Override
    public void save(OrderCart orderCart) {
        orderCartRepository.save(orderCart);
    }

    @Override
    public List<OrderCart> findAll() {
        return null;
    }

    @Override
    public OrderCart findById(Long id) {
        return null;
    }

    @Override
    public OrderCart findByCartAndProduct(Long id, long productId) {
        return orderCartRepository.findByCartAndProduct(id, productId);
    }
}
