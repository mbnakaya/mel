package br.com.selfcare.mel.dto;

//import br.com.selfcare.mel.domain.Address;
import br.com.selfcare.mel.domain.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class UserDTO {
    private Long id;
    private String email;
    private String password;
    private String fullName;
    private String phone;
    private Boolean isProvider;
//    private DocumentDTO document;
//    private List<AddressDTO> addresses;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public static UserDTO fromDomain(User user) {
//        List<AddressDTO> addresses = new ArrayList<>();
//        user.getAddresses().forEach(address -> addresses.add(AddressDTO.fromDomain(address)));

        return UserDTO.builder()
                .id(user.getId())
                .email(user.getEmail())
                .phone(user.getPhone())
                .fullName(user.getFullName())
                .isProvider(user.getIsProvider())
//                .document(DocumentDTO.fromDomain(user.getDocument()))
//                .addresses(addresses)
                .createdAt(user.getCreatedAt())
                .updatedAt(user.getUpdatedAt())
                .build();
    }
    public User toDomain() {
//        List<Address> addresses = new ArrayList<>();
//        this.addresses.forEach(addressDTO -> addresses.add(addressDTO.toDomain()));

        return User.builder()
                .id(this.getId())
                .email(this.getEmail())
                .password(this.getPassword())
                .fullName(this.getFullName())
                .phone(this.getPhone())
                .isProvider(this.getIsProvider())
//                .document(this.document.toDomain())
//                .addresses(addresses)
                .createdAt(this.getCreatedAt())
                .updatedAt(this.getUpdatedAt())
                .build();
    }
}
