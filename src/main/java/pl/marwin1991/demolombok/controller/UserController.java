package pl.marwin1991.demolombok.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.marwin1991.demolombok.model.User;
import pl.marwin1991.demolombok.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    /*
     * Fun fact from Spring:
     * Starting with Spring 4.3, if a class, which is configured as a Spring bean,
     * has only one constructor, the @Autowired annotation can be omitted and Spring
     * will use that constructor and inject all necessary dependencies
     *
     * source: https://stackoverflow.com/questions/41092751/spring-injects-dependencies-in-constructor-without-autowired-annotation
     */
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
}
