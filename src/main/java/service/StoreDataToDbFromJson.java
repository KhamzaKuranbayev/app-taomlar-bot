package service;

import com.google.gson.Gson;
import model.Category;
import model.Product;
import service.impl.CategoryServiceImpl;
import service.impl.ProductServiceImpl;

import java.io.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 1/6/2022
 * Time: 7:40 PM
 */
public class StoreDataToDbFromJson {

    public static void store() throws SQLException {
        Gson gson = new Gson();

        List<Category> categoryList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("src/main/resources/categories.json")))) {
            Category[] categories = gson.fromJson(bufferedReader, Category[].class);
            categoryList.addAll(Arrays.asList(categories));
        } catch (IOException e) {
            e.printStackTrace();
        }

        CategoryService categoryService = new CategoryServiceImpl();
        categoryService.saveAll(categoryList);

        List<Product> productList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("src/main/resources/products.json")))) {
            Product[] products = gson.fromJson(bufferedReader, Product[].class);
            productList.addAll(Arrays.asList(products));
        } catch (IOException e) {
            e.printStackTrace();
        }

        ProductService productService = new ProductServiceImpl();
        productService.saveAll(productList);

    }

}
