package br.com.selfcare.mel.controllers;

import br.com.selfcare.mel.domain.LoginFailedException;
import br.com.selfcare.mel.domain.User;
import br.com.selfcare.mel.dto.LoginDTO;
import br.com.selfcare.mel.services.interfaces.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/login")
public class LoginController {

    @Autowired
    private LoginService service;

    @PostMapping
    public ResponseEntity login(@RequestBody LoginDTO body) {
        User user  = service.login(body.getEmail(), body.getPassword());
        if (user != null)
            return new ResponseEntity(user, HttpStatus.OK);
        else throw new LoginFailedException();
    }
}
