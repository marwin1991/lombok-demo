package pl.marwin1991.demolombok.repository;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import pl.marwin1991.demolombok.model.Address;
import pl.marwin1991.demolombok.model.User;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;


@Repository
@Scope("singleton")
public class UserRepository {

    private final AtomicLong id = new AtomicLong(1);
    private final List<User> users = new ArrayList<>();

    @PostConstruct
    public void init() {

        Address address = Address.builder()
                .postCode("30-000")
                .city("Kraków")
                .street("ul. Rynek")
                .houseNumber("13")
                .flatNumber("23")
                .postOffice("Kraków")
                .country("PL")
                .build();


        User user = new User(
                id.getAndAdd(1),
                "Anna",
                "Nowak",
                LocalDate.of(1990, 1, 1),
                address,
                "+48 111 222 333"
        );
        users.add(user);
    }

    public List<User> getAllUsers() {
        return users;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public Long getNextId() {
        return id.getAndAdd(1);
    }
}
