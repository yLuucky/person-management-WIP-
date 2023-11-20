package com.lucky.personmanagement.person;

import com.lucky.personmanagement.person.infra.db.repositories.jpa.PersonRepository;
import com.lucky.personmanagement.person.services.ICreatePersonServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class PersonTest {

    @InjectMocks
    private ICreatePersonServiceImpl createPersonService;

    @Mock
    private PersonRepository personRepository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void createPersonTest() {

    }
}
