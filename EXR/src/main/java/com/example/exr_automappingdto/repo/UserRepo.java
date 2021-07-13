package com.example.exr_automappingdto.repo;

import com.example.exr_automappingdto.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    User findByEmailAndPassword(String email, String password);
}
