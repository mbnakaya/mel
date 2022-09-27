package br.com.selfcare.mel.services;

import br.com.selfcare.mel.domain.User;
import br.com.selfcare.mel.repositories.UserRepository;
import br.com.selfcare.mel.services.interfaces.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createAccount(User user) {
        return userRepository.save(user);
    }
}
