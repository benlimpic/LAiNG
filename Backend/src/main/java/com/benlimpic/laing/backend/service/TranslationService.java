package com.benlimpic.laing.backend.service;

import com.benlimpic.laing.backend.repository.TranslationRepository;
import org.springframework.stereotype.Service;

@Service
public class TranslationService {

    private final TranslationRepository translationRepository;

    public TranslationService(TranslationRepository translationRepository) {
        this.translationRepository = translationRepository;
    }
    
}
