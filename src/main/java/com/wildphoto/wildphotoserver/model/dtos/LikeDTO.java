package com.wildphoto.wildphotoserver.model.dtos;

import lombok.Data;

@Data
public class LikeDTO {

    private Long id;

    private Long photoId;

    private Long authorId;

    public LikeDTO(Long id, Long photoId, Long authorId) {
        this.id = id;
        this.photoId = photoId;
        this.authorId = authorId;
    }
}
