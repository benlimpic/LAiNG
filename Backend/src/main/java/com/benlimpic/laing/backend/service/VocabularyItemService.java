package com.benlimpic.laing.backend.service;

import org.springframework.stereotype.Service;
import com.benlimpic.laing.backend.repository.VocabularyItemRepository;

@Service
public class VocabularyItemService {

    private final VocabularyItemRepository vocabularyItemRepository;

    public VocabularyItemService(VocabularyItemRepository vocabularyItemRepository) {
        this.vocabularyItemRepository = vocabularyItemRepository;
    }


    
}
