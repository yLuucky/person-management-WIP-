package com.lucky.personmanagement.person.personAddress.infra.db.entities;

import com.lucky.personmanagement.address.infra.db.entities.Address;
import com.lucky.personmanagement.person.infra.db.entities.Person;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "PERSON_ADDRESS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(staticName = "create")
public class PersonAddress {

    @EmbeddedId
    private PersonAddressId id;

    @OneToOne
    @JoinColumn(name = "per_id", referencedColumnName = "per_id")
    private Person personId;

    @OneToOne
    @JoinColumn(name = "add_id", referencedColumnName = "add_id")
    private Address personAddressId;

    public static PersonAddress from(final PersonAddressId personAddressId) {
        final Person person = new Person().setId(personAddressId.getPersonId());
        final Address address = new Address().setId(personAddressId.getAddressId());
        return PersonAddress.create(personAddressId, person, address);
    }
}
