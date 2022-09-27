package br.com.selfcare.mel.dto;

import br.com.selfcare.mel.domain.Address;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AddressDTO {
    private String streetName;
    private String streetNumber;
    private String complement;
    private String zipCode;
    private String district;
    private String city;
    private String state;

    public static AddressDTO fromDomain(Address address) {
        return AddressDTO.builder()
                .streetName(address.getStreetName())
                .streetNumber(address.getStreetNumber())
                .complement(address.getComplement())
                .zipCode(address.getZipCode())
                .district(address.getDistrict())
                .city(address.getCity())
                .state(address.getState())
                .build();
    }

    public Address toDomain() {
        return Address.builder()
                .streetName(this.getStreetName())
                .streetNumber(this.getStreetNumber())
                .complement(this.getComplement())
                .zipCode(this.getZipCode())
                .district(this.getDistrict())
                .city(this.getCity())
                .state(this.getState())
                .build();
    }
}
