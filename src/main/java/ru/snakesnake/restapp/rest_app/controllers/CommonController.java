package ru.snakesnake.restapp.rest_app.controllers;


import org.springframework.web.bind.annotation.*;
import ru.snakesnake.restapp.rest_app.model.User;
import ru.snakesnake.restapp.rest_app.service.UserServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CommonController {

    private final UserServiceImpl userService;

    public CommonController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public List<User> showAllUser() {
        List<User> allUsers = userService.getAllUsers();
        return allUsers;
    }

    @PostMapping("/user")
    public User addNewUser(@RequestBody User user) {
        userService.saveUser(user);
        return user;
    }

    @PutMapping("/user")
    public User updateUser(@RequestBody User user) {
        userService.saveUser(user);
        return user;
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable long id) {
        userService.deleteUserById(id);
    }


}
