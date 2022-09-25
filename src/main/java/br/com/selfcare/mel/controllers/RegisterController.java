package br.com.selfcare.mel.controllers;

import br.com.selfcare.mel.dto.RegisterDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/register")
public class RegisterController {

    @PostMapping
    public RegisterDTO createAccount(@RequestBody RegisterDTO body) {
        return body;
    }

    @PutMapping("/{id}")
    public RegisterDTO updateAccount(@RequestBody RegisterDTO body, @PathVariable Long id) {
        return body;
    }
}
