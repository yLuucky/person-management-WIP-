package com.lucky.personmanagement.address.mappers;

import com.lucky.personmanagement.address.dtos.AddressDTO;
import com.lucky.personmanagement.address.infra.db.entities.Address;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AddressMapper {

    public static Address mapper(final AddressDTO addressDTO) {
        final Address address = new Address();
        address.setId(addressDTO.getId());
        address.setStreet(addressDTO.getStreet());
        address.setAddressNumber(addressDTO.getAddressNumber());
        address.setCity(addressDTO.getCity());

        return address;
    }
}
