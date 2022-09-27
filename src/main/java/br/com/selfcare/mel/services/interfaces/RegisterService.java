package br.com.selfcare.mel.services.interfaces;

import br.com.selfcare.mel.domain.User;

public interface RegisterService {
    User createAccount(User user);
}
