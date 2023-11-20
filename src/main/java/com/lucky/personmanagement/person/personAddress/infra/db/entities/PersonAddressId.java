package com.lucky.personmanagement.person.personAddress.infra.db.entities;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PersonAddressId {

    @Column(name = "per_id", nullable = false, insertable = false, updatable = false)
    private Long personId;
    @Column(name = "add_id", nullable = false, insertable = false, updatable = false)
    private Long addressId;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(!(obj instanceof final PersonAddressId compareId)) return false;

        return Objects.equals(this.getPersonId(), compareId.getPersonId())
                && Objects.equals(this.getAddressId(), compareId.getAddressId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPersonId(), getAddressId());
    }
}
