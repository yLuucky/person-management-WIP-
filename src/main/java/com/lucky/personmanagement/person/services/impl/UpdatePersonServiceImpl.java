package com.lucky.personmanagement.person.services.impl;

import com.lucky.personmanagement.person.dtos.PersonDTO;
import com.lucky.personmanagement.shared.exceptions.PersonNotFoundException;
import com.lucky.personmanagement.person.infra.db.entities.Person;
import com.lucky.personmanagement.person.infra.db.repositories.jpa.PersonRepository;
import com.lucky.personmanagement.person.mappers.PersonMapper;
import com.lucky.personmanagement.person.services.IUpdatePersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdatePersonServiceImpl implements IUpdatePersonServiceImpl {

    private final PersonRepository personRepository;

    @Autowired
    public UpdatePersonServiceImpl(final PersonRepository repository) {
        this.personRepository = repository;
    }

    @Override
    public Person execute(final PersonDTO personDTO) {
        final boolean userDoesExist = personRepository.existsById(personDTO.getId());

        if(!userDoesExist){
            throw new PersonNotFoundException();
        }

        final Person person = PersonMapper.mapper(personDTO);
        return personRepository.save(person);
    }
}
