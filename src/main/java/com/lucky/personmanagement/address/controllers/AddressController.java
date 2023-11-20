package com.lucky.personmanagement.address.controllers;

import com.lucky.personmanagement.address.services.ICreatePersonAddressServiceImpl;
import com.lucky.personmanagement.address.services.IRetrievePersonAddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("address")
public class AddressController {

    private final ICreatePersonAddressServiceImpl createPersonAddressService;
    private final IRetrievePersonAddressServiceImpl retrievePersonAddressService;

    @Autowired
    public AddressController(final ICreatePersonAddressServiceImpl createPersonAddressService,
                             final IRetrievePersonAddressServiceImpl retrievePersonAddressService) {
        this.createPersonAddressService = createPersonAddressService;
        this.retrievePersonAddressService = retrievePersonAddressService;
    }
}
