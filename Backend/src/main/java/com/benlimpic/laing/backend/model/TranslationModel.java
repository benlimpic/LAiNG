package com.benlimpic.laing.backend.model;

import lombok.*;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "translations")
public class TranslationModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "source_text", nullable = false, columnDefinition = "TEXT")
    private String sourceText;

    @Column(name = "translated_text", nullable = false, columnDefinition = "TEXT")
    private String translatedText;

}