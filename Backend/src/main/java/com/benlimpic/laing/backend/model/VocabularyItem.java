package com.benlimpic.laing.backend.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import jakarta.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Tabel(name="vocabulary_items")
public class VocabularyItem {
    private Long id;
    private String word;
    private String definition;
    private String exampleSentence;
    private String partOfSpeech;
    private String translation;
    private String sourceLanguage;
    private String targetLanguage;    
}
