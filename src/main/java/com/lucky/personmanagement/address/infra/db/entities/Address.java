package com.lucky.personmanagement.address.infra.db.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity
@Table(name = "ADDRESS")
@Getter
@Setter
@Accessors(chain = true)
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name="add_id", nullable = false)
    private Long id;

    @Column(name="add_street", length = 60, nullable = false)
    private String street;

    @Column(name="add_postalCode", length = 20, nullable = false)
    private String postalCode;

    @Column(name="add_addressNumber", length = 10, nullable = false)
    private String addressNumber;

    @Column(name="add_city", length = 60, nullable = false)
    private String city;
}
