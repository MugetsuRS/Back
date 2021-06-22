package com.example.Back.Entity.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
public class CommentsDTO {
    private String commentary;
    private String dayofadditing;

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }

    public void setDayofadditing(String dayofadditing) {
        this.dayofadditing = dayofadditing;
    }
}
