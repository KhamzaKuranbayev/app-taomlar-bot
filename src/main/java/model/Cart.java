package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 1/11/2022
 * Time: 7:07 PM
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
    private Long id;
    private Long userId;

    public Cart(Long userId) {
        this.userId = userId;
    }
}
