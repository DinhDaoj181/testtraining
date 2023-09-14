package testtraining.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import testtraining.demo.entity.Brand;
import testtraining.demo.entity.Product;
import testtraining.demo.service.BrandService;
import testtraining.demo.service.ProductService;
import testtraining.demo.service.StatusService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/testtraining")
public class MainController {
    @Autowired
    private BrandService brandService;

    @Autowired
    private ProductService productService;

    @Autowired
    private StatusService statusService;

    @GetMapping("/")
    public String test(){
        return "I CAN DO IT";
    }

    @GetMapping("/products")
    List<Product> showProducts(){
        return productService.getAllProduct();
    }

    @PostMapping("/product")
    public Product addProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }

}
