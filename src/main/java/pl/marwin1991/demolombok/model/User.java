package pl.marwin1991.demolombok.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long id;
    private String firstName;
    private String surname;
    private LocalDate birthDate;
    private Address address;
    private String phoneNumber;

}
