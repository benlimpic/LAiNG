package com.benlimpic.laing.backend.service;

import org.springframework.stereotype.Service;
import com.benlimpic.laing.backend.repository.StoryRepository;

@Service
public class StoryService {

    private final StoryRepository storyRepository;

    public StoryService(StoryRepository storyRepository) {
        this.storyRepository = storyRepository;
    }

    
}
