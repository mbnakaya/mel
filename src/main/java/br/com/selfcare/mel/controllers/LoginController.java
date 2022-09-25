package br.com.selfcare.mel.controllers;

import br.com.selfcare.mel.dto.LoginDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/login")
public class LoginController {

    public void login(@RequestBody LoginDTO body) {}
}
