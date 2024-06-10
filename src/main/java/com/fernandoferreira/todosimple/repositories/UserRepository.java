package com.fernandoferreira.todosimple.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fernandoferreira.todosimple.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
   
}
