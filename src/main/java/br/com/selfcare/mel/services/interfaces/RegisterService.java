package br.com.selfcare.mel.services.interfaces;

import br.com.selfcare.mel.domain.User;

public interface RegisterService {
    User createUser(User user);
    User getUser(Long id);
    User updateUser(User user);
}
