package testtraining.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import testtraining.demo.entity.Status;

@Repository
public interface StatusRepository extends JpaRepository<Status,Long> {
}
