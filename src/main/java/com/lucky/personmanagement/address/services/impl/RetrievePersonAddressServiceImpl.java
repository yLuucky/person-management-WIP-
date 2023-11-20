package com.lucky.personmanagement.address.services.impl;

import com.lucky.personmanagement.address.infra.db.entities.Address;
import com.lucky.personmanagement.address.infra.db.repositories.jpa.AddressRepository;
import com.lucky.personmanagement.address.services.IRetrievePersonAddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RetrievePersonAddressServiceImpl implements IRetrievePersonAddressServiceImpl {

    private final AddressRepository addressRepository;

    @Autowired
    public RetrievePersonAddressServiceImpl(final AddressRepository repository) {
        this.addressRepository = repository;
    }

    @Override
    public List<Address> execute(final Long id) {
        return addressRepository.findAllByPersonId(id);
    }
}
