package com.lucky.personmanagement.address.services;

import com.lucky.personmanagement.address.infra.db.entities.Address;

import java.util.List;

public interface IRetrievePersonAddressServiceImpl {
    List<Address> execute(Long id);
}
