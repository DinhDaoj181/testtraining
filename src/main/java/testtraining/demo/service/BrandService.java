package testtraining.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testtraining.demo.entity.Brand;
import testtraining.demo.repository.BrandRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BrandService {
    @Autowired
    private BrandRepository brandRepository;

    public List<Brand> getAllBrand(){
        return brandRepository.getAllBrand();
    }

    public Optional<Brand> getBrandById(Long id){
        if(id==null) return null;
        return brandRepository.findById(id);
    }
}
