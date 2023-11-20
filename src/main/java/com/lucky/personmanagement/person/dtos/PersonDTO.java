package com.lucky.personmanagement.person.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(staticName = "create")
public class PersonDTO {

    private Long id;
    private String name;
    private LocalDate birthDate;
}
