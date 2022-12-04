package br.com.selfcare.mel.controllers;

import br.com.selfcare.mel.domain.User;
import br.com.selfcare.mel.dto.UserDTO;
import br.com.selfcare.mel.services.interfaces.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/register")
@CrossOrigin
public class RegisterController {

    @Autowired
    private RegisterService service;

    @PostMapping
    public ResponseEntity createUser(@RequestBody UserDTO body) {
        User user = service.createUser(body.toDomain());
        return new ResponseEntity(UserDTO.fromDomain(user), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public UserDTO getUser(@PathVariable Long id) {
        User user = service.getUser(id);
        return UserDTO.fromDomain(user);
    }

    @PutMapping("/{id}")
    public UserDTO updateAccount(@RequestBody UserDTO body, @PathVariable Long id) {
        body.setId(id);
        User user = service.updateUser(body.toDomain());
        return UserDTO.fromDomain(user);
    }
}
