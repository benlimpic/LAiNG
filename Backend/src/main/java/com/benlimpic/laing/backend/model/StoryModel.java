package com.benlimpic.laing.backend.model;

import jakarta.persistence.Entity;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "stories")

public class StoryModel {
    
    private String title;
    private String content;
    private String author;
    private String dateCreated;

}
