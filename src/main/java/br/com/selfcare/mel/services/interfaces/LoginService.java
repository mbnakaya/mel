package br.com.selfcare.mel.services.interfaces;

import br.com.selfcare.mel.domain.User;

public interface LoginService {
    User login(String email, String password);
}
