package com.caiocesar.course.resources;

import com.caiocesar.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> FindAll() {
        User u = new User(1L, "Caio", "caio@gmail.com", "55555", "12345");
        return ResponseEntity.ok().body(u);
    }
}
