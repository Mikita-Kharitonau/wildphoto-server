package com.wildphoto.wildphotoserver.model.dtos;


import lombok.Data;

import java.util.Date;

@Data
public class CommentDTO {

    private Long id;

    private String text;

    private Date date;

    private UserDTO author;

    private Long photoId;

    public CommentDTO(Long id, String text, Date date, UserDTO author, Long photoId) {
        this.id = id;
        this.text = text;
        this.date = date;
        this.author = author;
        this.photoId = photoId;
    }
}
