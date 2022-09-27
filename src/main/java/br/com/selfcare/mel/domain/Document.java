package br.com.selfcare.mel.domain;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Data
@Builder
@Entity
@Table(name = "documents")
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String number;
    @Enumerated(EnumType.STRING)
    private DocumentType type;

    @OneToOne(mappedBy = "document")
    private User user;
}

