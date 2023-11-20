package com.lucky.personmanagement.person.mappers;

import com.lucky.personmanagement.person.dtos.PersonDTO;
import com.lucky.personmanagement.person.infra.db.entities.Person;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PersonMapper {

    public static Person mapper(final PersonDTO personDTO) {
        final Person person = new Person();
        person.setId(personDTO.getId());
        person.setName(personDTO.getName());
        person.setBirthDate(personDTO.getBirthDate());

        return person;
    }
}
