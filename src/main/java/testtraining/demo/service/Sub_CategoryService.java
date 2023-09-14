package testtraining.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testtraining.demo.entity.Sub_Category;
import testtraining.demo.repository.Sub_CategoryRepository;

import java.util.List;
import java.util.Optional;

@Service
public class Sub_CategoryService {
    @Autowired
    private Sub_CategoryRepository sub_categoryRepository;

    public List<Sub_Category> getAllSub_Category(){
        return sub_categoryRepository.findAll();
    }

    public Optional<Sub_Category> getSub_CategoryById(Long id){
        return sub_categoryRepository.findById(id);
    }
}
