package br.com.selfcare.mel.services.interfaces;

import br.com.selfcare.mel.domain.User;
import br.com.selfcare.mel.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Boolean login(String email, String password) {
        User user = userRepository.findByEmailAndPassword(email, password);
        return user != null;
    }
}
