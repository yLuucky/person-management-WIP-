package com.lucky.personmanagement.address.infra.db.repositories.jpa;

import com.lucky.personmanagement.address.infra.db.entities.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {

    List<Address> findAllByPersonId(Long id);
}
