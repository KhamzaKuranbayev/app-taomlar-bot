package model;

import enums.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 1/11/2022
 * Time: 7:53 PM
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Long id;
    private Double totalPrice;
    private LocalDateTime orderDate;
    private OrderStatus status;
}
