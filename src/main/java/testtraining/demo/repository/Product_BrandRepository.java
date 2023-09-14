package testtraining.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import testtraining.demo.entity.Product_Brand;

@Repository
public interface Product_BrandRepository extends JpaRepository<Product_Brand,Long> {
}
