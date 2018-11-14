package com.study.shopping.product.model;

import com.study.shopping.Property;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.sql.*;

public class GetProductResponse {
    private Product product;


    public GetProductResponse() throws SQLException {
        String query = "SELECT * FROM `PRODUCT` WHERE id = 1";
        Property property = new Property();
        Connection connection = DriverManager.getConnection(property.getDB_PATH());
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);

        this.product = new Product(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getString("description"),
                rs.getInt("price"));
        ;
    }

    public GetProductResponse(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

}
