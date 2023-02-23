package com.avrezzon.mealplanningcalendar.repository;

import com.avrezzon.mealplanningcalendar.model.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByEmail(String email);
}
