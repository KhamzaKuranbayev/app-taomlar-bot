package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 1/11/2022
 * Time: 7:59 PM
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetail {
    private Long id;
    private Long orderId;
    private Long productId;
    private Integer amount;
    private Double totalPrice;


}
