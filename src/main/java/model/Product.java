package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 1/6/2022
 * Time: 7:13 PM
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Long id;
    private Long categoryId;
    private String name;
    private Double price;
    private String imageUrl;
}
