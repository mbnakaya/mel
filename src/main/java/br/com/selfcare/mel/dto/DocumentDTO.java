package br.com.selfcare.mel.dto;

import br.com.selfcare.mel.domain.Document;
import br.com.selfcare.mel.domain.DocumentType;
import lombok.Builder;
import lombok.Data;

import br.com.selfcare.mel.domain.Document.DocumentBuilder;

@Data
@Builder
public class DocumentDTO {
    private String number;
    private DocumentType type;

    public static DocumentDTO fromDomain(Document document) {
        return DocumentDTO.builder()
                .number(document.getNumber())
                .type(document.getType())
                .build();
    }

    public Document toDomain() {
        return Document.builder()
                .number(this.getNumber())
                .type(this.getType())
                .build();
    }
}
