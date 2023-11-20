package com.lucky.personmanagement.person.services;

import com.lucky.personmanagement.person.dtos.PersonDTO;
import com.lucky.personmanagement.person.infra.db.entities.Person;

public interface ICreatePersonServiceImpl {
    Person execute(PersonDTO personDTO);
}
