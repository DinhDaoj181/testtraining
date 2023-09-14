package testtraining.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testtraining.demo.entity.Product_Brand;
import testtraining.demo.repository.Product_BrandRepository;

import java.util.List;

@Service
public class Product_BrandService {
    @Autowired
    private Product_BrandRepository product_brandRepository;

    public List<Product_Brand> getAllProduct_brand(){
        return product_brandRepository.findAll();
    }
}
