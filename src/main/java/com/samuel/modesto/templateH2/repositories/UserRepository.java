package com.samuel.modesto.templateH2.repositories;

import com.samuel.modesto.templateH2.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
