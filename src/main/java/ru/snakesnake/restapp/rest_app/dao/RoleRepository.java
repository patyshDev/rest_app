package ru.snakesnake.restapp.rest_app.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.snakesnake.restapp.rest_app.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByRole(String role);
}
