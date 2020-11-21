package pl.marwin1991.demolombok.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.marwin1991.demolombok.model.User;
import pl.marwin1991.demolombok.repository.UserRepository;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class UserService {

    private final UserRepository userRepository;

    public List<User> getUsers() {
        //TODO: converter
        return userRepository.getAllUsers();
    }

    public User createUser(User user) {
        //TODO: converter
        user.setId(userRepository.getNextId());
        userRepository.addUser(user);
        log.info("User added: " + user.toString());
        //TODO: converter
        return user;
    }

}
