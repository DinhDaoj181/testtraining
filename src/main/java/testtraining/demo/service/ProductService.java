package testtraining.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testtraining.demo.entity.Product;
import testtraining.demo.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    public Product updateProduct(Product product,Long id){
        if(product!=null){
            Product product1=productRepository.getById(id);
            if(product1!=null){
                product1.setProduce_name(product.getProduce_name());
                product1.setColor(product.getColor());
                product1.setQuantity(product.getQuantity());
                product1.setSell_price(product.getSell_price());
                product1.setOrigin_price(product.getOrigin_price());
                product1.setSub_category(product.getSub_category());
                product1.setStatus(product.getStatus());
            }
        }
        return null;
    }

    public Optional<Product> getOneProduct(Long id){
        return productRepository.findById(id);
    }
}
