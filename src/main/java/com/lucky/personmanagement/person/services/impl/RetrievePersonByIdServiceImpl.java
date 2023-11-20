package com.lucky.personmanagement.person.services.impl;

import com.lucky.personmanagement.person.infra.db.entities.Person;
import com.lucky.personmanagement.person.infra.db.repositories.jpa.PersonRepository;
import com.lucky.personmanagement.person.services.IRetrievePersonByIdServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RetrievePersonByIdServiceImpl implements IRetrievePersonByIdServiceImpl {

    private final PersonRepository personRepository;

    @Autowired
    public RetrievePersonByIdServiceImpl(final PersonRepository repository) {
        this.personRepository = repository;
    }

    @Override
    public Optional<Person> execute(final Long id) {
        return personRepository.findById(id);
    }
}
