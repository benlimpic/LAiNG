package com.benlimpic.laing.backend.dto.response;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TranslationResponse {
    private String sourceLanguage;
    private String targetLanguage;
    private String sourceText;
    private String translatedText;
}
