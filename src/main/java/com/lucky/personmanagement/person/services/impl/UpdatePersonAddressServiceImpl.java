package com.lucky.personmanagement.person.services.impl;

import com.lucky.personmanagement.address.infra.db.entities.Address;
import com.lucky.personmanagement.address.infra.db.repositories.jpa.AddressRepository;
import com.lucky.personmanagement.person.services.IUpdatePersonAddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UpdatePersonAddressServiceImpl implements IUpdatePersonAddressServiceImpl {
    private final AddressRepository addressRepository;

    @Autowired
    public UpdatePersonAddressServiceImpl(final AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }


    public void execute(final Long id, final Long addressId) {
        List<Address> addresses = addressRepository.findAllByPersonId(id);
    }
}
