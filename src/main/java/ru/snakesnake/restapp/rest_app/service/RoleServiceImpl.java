package ru.snakesnake.restapp.rest_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.snakesnake.restapp.rest_app.dao.RoleRepository;
import ru.snakesnake.restapp.rest_app.model.Role;

import java.util.List;

@Service
public class RoleServiceImpl {
    @Autowired
    RoleRepository roleRepository;

    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    public Role getRoleByName(String name) {
        return roleRepository.findByRole(name);
    }

}
