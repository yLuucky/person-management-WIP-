package com.lucky.personmanagement.person.services;

import com.lucky.personmanagement.person.infra.db.entities.Person;

import java.util.List;

public interface IRetrieveAllPeopleServiceImpl {
    List<Person> execute();
}
