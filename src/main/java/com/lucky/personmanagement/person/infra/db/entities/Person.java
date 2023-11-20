package com.lucky.personmanagement.person.infra.db.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.LocalDate;

@Entity
@Table(name = "PERSON")
@Getter
@Setter
@Accessors(chain = true)
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="pp_id", nullable=false, unique=true)
    private Long id;
    @Column(name="pp_name", length=60, nullable=false)
    private String name;
    @Column(name="pp_birthDate", nullable=false, columnDefinition="DATE")
    private LocalDate birthDate;

}
