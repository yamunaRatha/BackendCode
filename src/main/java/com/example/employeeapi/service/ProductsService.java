package com.example.employeeapi.service;

import com.example.employeeapi.model.Employee;
import com.example.employeeapi.model.Product;

import java.util.List;

public interface ProductsService {


    List<Product> getProducts();

    Product getProduct(Integer prdId);

    Product addProducts(Product prd);

    Product updateProducts(Product prd);

    String delProducts(Integer prdId);

}

