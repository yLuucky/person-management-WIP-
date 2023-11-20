package com.lucky.personmanagement.address.services;

import com.lucky.personmanagement.address.dtos.AddressDTO;
import com.lucky.personmanagement.address.infra.db.entities.Address;
import com.lucky.personmanagement.person.dtos.PersonDTO;

public interface ICreatePersonAddressServiceImpl {
    Address execute(Long personId, AddressDTO addressDTO);
}
