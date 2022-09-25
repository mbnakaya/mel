package br.com.selfcare.mel.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RegisterDTO {
    private Long id;
    private String fullName;
    private Boolean serviceProvider;
    private DocumentDTO document;
    private AddressDTO address;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
