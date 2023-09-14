package testtraining.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import testtraining.demo.entity.Brand;

import java.util.List;

@Repository
public interface BrandRepository extends JpaRepository<Brand,Long> {

    @Query(value = "SELECT * FROM brand", nativeQuery = true)
    List<Brand> getAllBrand();

}
