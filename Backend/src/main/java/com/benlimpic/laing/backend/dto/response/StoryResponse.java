package com.benlimpic.laing.backend.dto.response;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StoryResponse {
    private String title;
    private String content;
    private String author;
    private String dateCreated;
}