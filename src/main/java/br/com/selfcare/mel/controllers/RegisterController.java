package br.com.selfcare.mel.controllers;

import br.com.selfcare.mel.domain.User;
import br.com.selfcare.mel.dto.UserDTO;
import br.com.selfcare.mel.services.interfaces.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/register")
public class RegisterController {

    @Autowired
    private RegisterService service;

    @PostMapping
    public UserDTO createUser(@RequestBody UserDTO body) {  //TODO: CREATE VALIDATION ON REQUEST BODY
        User user = service.createAccount(body.toDomain());
        return UserDTO.fromDomain(user);
    }

    @PutMapping("/{id}")
    public UserDTO updateAccount(@RequestBody UserDTO body, @PathVariable Long id) {
        return body;
    }
}
