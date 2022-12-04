package br.com.selfcare.mel.services;

import br.com.selfcare.mel.domain.User;
import br.com.selfcare.mel.repositories.UserRepository;
import br.com.selfcare.mel.services.interfaces.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User login(String email, String password) {
        User user = userRepository.findByEmailAndPassword(email, password);
        return user;
    }
}
