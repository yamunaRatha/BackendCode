package com.example.employeeapi.service;

import com.example.employeeapi.model.Product;
import com.example.employeeapi.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductsServiceImpl implements ProductsService {

    @Autowired
    private ProductsRepository eRepo;

    @Override
    public List<Product> getProducts()
    {
        return eRepo.findAll();
    }
    @Override
    public Product getProduct(Integer prdId)
    {
        Optional<Product> prd = eRepo.findById(prdId);
        if(prd.isPresent())
        {
            return prd.get();
        }
        return null;
    }

    @Override
    public Product addProducts(Product prd)
    {
        return eRepo.save(prd);
    }

    @Override
    public Product updateProducts(Product prd)
    {
        return eRepo.save(prd);
    }

    @Override
    public String delProducts(Integer id) {
        if (!(id.toString().isEmpty())) {
            eRepo.deleteById(id);
            return "Record deleted successfully.";
        } else {
            return "Invalid Id, hence record not deleted.";
        }
    }
}

