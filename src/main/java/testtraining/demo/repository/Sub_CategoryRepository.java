package testtraining.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import testtraining.demo.entity.Sub_Category;

@Repository
public interface Sub_CategoryRepository extends JpaRepository<Sub_Category,Long> {
}
