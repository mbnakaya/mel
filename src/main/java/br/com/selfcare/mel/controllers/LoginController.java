package br.com.selfcare.mel.controllers;

import br.com.selfcare.mel.dto.LoginDTO;
import br.com.selfcare.mel.services.interfaces.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public void login(@RequestBody LoginDTO body) {
        service.login(body.getEmail(), body.getPassword());
    }
}
