package testtraining.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testtraining.demo.entity.Status;
import testtraining.demo.repository.StatusRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StatusService {
    @Autowired
    private StatusRepository statusRepository;

    public List<Status> getAllStatus(){
        return statusRepository.findAll();
    }

    public Optional<Status> getStatusById(Long id){
        return statusRepository.findById(id);
    }
}
