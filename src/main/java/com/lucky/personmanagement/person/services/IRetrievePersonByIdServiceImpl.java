package com.lucky.personmanagement.person.services;

import com.lucky.personmanagement.person.infra.db.entities.Person;

import java.util.Optional;

public interface IRetrievePersonByIdServiceImpl {
    Optional<Person> execute(Long id);
}
