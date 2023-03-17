package cat.iesmanacor.msusuari.service;

import cat.iesmanacor.msusuari.model.User;
import cat.iesmanacor.msusuari.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Set<User> getAllUsers() {
        return new HashSet<>(userRepository.findAll());
    }
}
