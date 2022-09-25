package br.com.selfcare.mel.dto;

import lombok.Data;

@Data
public class DocumentDTO {
    private String number;
    private DocumentType type;
}

enum DocumentType { CPF, CNPJ }