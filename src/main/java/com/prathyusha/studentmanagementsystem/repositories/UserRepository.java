package com.prathyusha.studentmanagementsystem.repositories;

import com.prathyusha.studentmanagementsystem.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
  User findUserByUserId(Long id);
}
