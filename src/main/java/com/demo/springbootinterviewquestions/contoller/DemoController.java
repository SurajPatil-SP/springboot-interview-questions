package com.demo.springbootinterviewquestions.contoller;

import com.demo.springbootinterviewquestions.dto.UserDetails;
import com.demo.springbootinterviewquestions.repository.UserDetailsRepository;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
//@CrossOrigin(origins = "*")   //Allow for all
public class DemoController {
    @Autowired
    private UserDetailsRepository repository;

    @GetMapping("/users/name")
    public String checkBodyInGET(@RequestBody UserDetails userDetails) {
        return userDetails.getName();
    }

    @PostMapping("/users") // not idempotent
    @Operation(description = "INSERT NEW USER")
    @ResponseStatus(HttpStatus.CREATED)
    public UserDetails addNewUser(@RequestBody UserDetails userDetails){
        return repository.save(userDetails);
    }

    @PutMapping("/users/{id}") // idempotent
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public UserDetails addAndUpdateUser(@PathVariable int id, @RequestBody UserDetails userDetails){
        UserDetails existingUserDetails = repository.findById(id).get();
        existingUserDetails.setName(userDetails.getName());
        existingUserDetails.setAge(userDetails.getAge());
        return repository.save(existingUserDetails);
    }
}
