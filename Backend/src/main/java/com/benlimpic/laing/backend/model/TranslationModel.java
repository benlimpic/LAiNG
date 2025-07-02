package com.benlimpic.laing.backend.model;


import java.lang.reflect.Array;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "translations")
public class TranslationModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String sourceLanguage;
    private String targetLanguage;
    private ArrayList<String> highlightedText;
    private String translatedText;
    private String dateCreated;
 

}