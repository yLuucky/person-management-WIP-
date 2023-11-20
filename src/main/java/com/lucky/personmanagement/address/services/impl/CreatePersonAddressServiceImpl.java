package com.lucky.personmanagement.address.services.impl;

import com.lucky.personmanagement.address.dtos.AddressDTO;
import com.lucky.personmanagement.address.infra.db.entities.Address;
import com.lucky.personmanagement.address.infra.db.repositories.jpa.AddressRepository;
import com.lucky.personmanagement.address.mappers.AddressMapper;
import com.lucky.personmanagement.address.services.ICreatePersonAddressServiceImpl;
import com.lucky.personmanagement.shared.exceptions.PersonNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreatePersonAddressServiceImpl implements ICreatePersonAddressServiceImpl {

    private final AddressRepository addressRepository;

    @Autowired
    public CreatePersonAddressServiceImpl(final AddressRepository repository) {
        this.addressRepository = repository;
    }

    @Override
    public Address execute(final Long personId, AddressDTO addressDTO) {
        final boolean userDoesExist = addressRepository.existsById(personId);

        if(!userDoesExist){
            throw new PersonNotFoundException();
        }

        final Address address = AddressMapper.mapper(addressDTO);

        return addressRepository.save(address);
    }
}
