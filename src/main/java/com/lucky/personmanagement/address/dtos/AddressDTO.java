package com.lucky.personmanagement.address.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(staticName = "create")
public class AddressDTO {

    private Long id;
    private String street;
    private String addressNumber;
    private String city;
}
