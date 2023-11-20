package com.lucky.personmanagement.person.infra.db.repositories.jpa;

import com.lucky.personmanagement.person.infra.db.entities.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

    List<Person> findAll();
}
