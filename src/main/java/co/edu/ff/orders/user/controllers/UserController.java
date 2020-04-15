package co.edu.ff.orders.user.controllers;

import co.edu.ff.orders.user.domain.CreateUserRequest;
import co.edu.ff.orders.user.domain.UserCreated;
import co.edu.ff.orders.user.services.UserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {

    private final UserServices services;

    @PostMapping
    public UserCreated createUser(@RequestBody CreateUserRequest userBody) {
        return services.createUser(userBody.getUsername(), userBody.getPassword());
    }

    @GetMapping("/{id}")
    public UserCreated getUserById(@PathVariable Long id) {
        return services.findById(id);
    }
}
