package com.example.employeeapi.controller;

import com.example.employeeapi.model.Product;
import com.example.employeeapi.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductsController {

    @Autowired
    public ProductsService eServ;

    @GetMapping("/getProducts")
    public List<Product> getProducts()
    {
        return eServ.getProducts();
    }

    @GetMapping("/getProduct")
    public Product getProduct(@RequestParam Integer id)
    {
        return eServ.getProduct(id);
    }

    @PostMapping("/addProducts")
    public Product addProducts(@RequestBody Product prd)
    {
        return eServ.addProducts(prd);
    }

    @PutMapping ("/updProducts")
    public Product updProducts(@RequestParam Integer id, @RequestBody Product newVal)
    {
        newVal.setProductId(id);
        return eServ.updateProducts(newVal);
    }

    @DeleteMapping("/delProducts")
    public String delProducts(@RequestParam Integer id)
    {
        return eServ.delProducts(id);
    }
}

