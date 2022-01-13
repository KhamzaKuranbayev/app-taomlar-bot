package repository.impl;

import model.OrderCart;
import repository.OrderCartRepository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import static config.DbConfig.connection;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 1/11/2022
 * Time: 7:34 PM
 */
public class OrderCartRepositoryImpl implements OrderCartRepository {

    @Override
    public void save(OrderCart orderCart) {
        String INSERT_NEW_ORDER_CART = "INSERT INTO order_cart (cart_id, product_id, amount, total_price, status, deleted)" +
                " VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement statement = connection.prepareStatement(INSERT_NEW_ORDER_CART);
            statement.setLong(1, orderCart.getCartId());
            statement.setLong(2, orderCart.getProductId());
            statement.setInt(3, orderCart.getAmount());
            statement.setDouble(4, orderCart.getTotalPrice());
            statement.setString(5, orderCart.getStatus().name());
            statement.setBoolean(6, orderCart.isDeleted());
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
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
        return null;
    }
}
