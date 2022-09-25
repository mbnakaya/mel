package br.com.selfcare.mel.dto;

import lombok.Data;

@Data
public class AddressDTO {
    private String streetName;
    private String streetNumber;
    private String complement;
    private String zipCode;
    private String district;
    private String city;
    private String state;
}
