package com.lucky.personmanagement.person.services.impl;

import com.lucky.personmanagement.person.infra.db.entities.Person;
import com.lucky.personmanagement.person.infra.db.repositories.jpa.PersonRepository;
import com.lucky.personmanagement.person.services.IRetrieveAllPeopleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RetrieveAllPeopleServiceImpl implements IRetrieveAllPeopleServiceImpl {

    final private PersonRepository personRepository;

    @Autowired
    public RetrieveAllPeopleServiceImpl(final PersonRepository repository) {
        this.personRepository = repository;
    }

    @Override
    public List<Person> execute() {
        return personRepository.findAll();
    }
}
