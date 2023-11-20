package com.lucky.personmanagement.person.services.impl;

import com.lucky.personmanagement.person.dtos.PersonDTO;
import com.lucky.personmanagement.person.infra.db.entities.Person;
import com.lucky.personmanagement.person.infra.db.repositories.jpa.PersonRepository;
import com.lucky.personmanagement.person.mappers.PersonMapper;
import com.lucky.personmanagement.person.services.ICreatePersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreatePersonServiceImpl implements ICreatePersonServiceImpl {

    private final PersonRepository personRepository;

    @Autowired
    public CreatePersonServiceImpl(final PersonRepository repository) {
        this.personRepository = repository;
    }

    @Override
    public Person execute(final PersonDTO personDTO) {
        final Person person = PersonMapper.mapper(personDTO);
        return personRepository.save(person);
    }
}
