package com.vanshika.Full.Stack.backend.repository;

import com.vanshika.Full.Stack.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
