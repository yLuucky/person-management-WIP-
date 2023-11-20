package com.lucky.personmanagement.person.personAddress.infra.db.repositories;

import com.lucky.personmanagement.person.personAddress.infra.db.entities.PersonAddress;
import com.lucky.personmanagement.person.personAddress.infra.db.entities.PersonAddressId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonAddressRepository extends CrudRepository<PersonAddress, PersonAddressId> {
}
