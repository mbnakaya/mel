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
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUser(Long id) {
        return userRepository.getReferenceById(id);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }
}
