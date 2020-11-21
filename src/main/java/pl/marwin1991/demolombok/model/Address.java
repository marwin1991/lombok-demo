package pl.marwin1991.demolombok.model;

import lombok.*;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Getter
@Setter
@ToString
@EqualsAndHashCode
//@Data = @Getter @Setter @ToString @EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
//
@Builder
public class Address {

    private String postCode;
    private String city;
    private String street;
    private String houseNumber;
    private String flatNumber;
    private String postOffice;
    private String country;

    public Address(String postCode, String country) {
        this.postCode = postCode;
        this.country = country;
    }

    public String getCountry() {
        log.info("getCountry");
        return country.toUpperCase();
    }
}
