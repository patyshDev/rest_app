package ru.snakesnake.restapp.rest_app.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.snakesnake.restapp.rest_app.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
