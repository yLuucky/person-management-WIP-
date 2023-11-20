package com.lucky.personmanagement.person.controllers;

import com.lucky.personmanagement.person.services.ICreatePersonServiceImpl;
import com.lucky.personmanagement.person.services.IUpdatePersonServiceImpl;
import com.lucky.personmanagement.person.services.IRetrieveAllPeopleServiceImpl;
import com.lucky.personmanagement.person.services.IRetrievePersonByIdServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("person")
public class PersonController {

    private final ICreatePersonServiceImpl createPersonService;
    private final IUpdatePersonServiceImpl editPersonService;
    private final IRetrievePersonByIdServiceImpl findPersonByIdService;
    private final IRetrieveAllPeopleServiceImpl findAllPeopleService;

    @Autowired
    public PersonController(final ICreatePersonServiceImpl createPersonService,
                            final IUpdatePersonServiceImpl editPersonService,
                            final IRetrievePersonByIdServiceImpl findPersonByIdService,
                            final IRetrieveAllPeopleServiceImpl findAllPeopleService) {
        this.createPersonService = createPersonService;
        this.editPersonService = editPersonService;
        this.findPersonByIdService = findPersonByIdService;
        this.findAllPeopleService = findAllPeopleService;
    }
}
