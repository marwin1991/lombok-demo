package pl.marwin1991.demolombok.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.marwin1991.demolombok.model.User;
import pl.marwin1991.demolombok.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return userRepository.getAllUsers();
    }

    public User createUser(User user) {
        user.setId(userRepository.getNextId());
        userRepository.addUser(user);
        return user;
    }

}
