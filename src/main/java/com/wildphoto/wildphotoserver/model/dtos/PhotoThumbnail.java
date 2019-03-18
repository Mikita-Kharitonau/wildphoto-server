package com.wildphoto.wildphotoserver.model.dtos;

import lombok.Data;

@Data
public class PhotoThumbnail {

    private Long id;

    private String src;

    private String title;

    private String author;

    private Integer commentsCount;

    private Integer likesCount;

    private Integer dislikesCount;

    public PhotoThumbnail(Long id, String src, String title, String author, Integer commentsCount,
                          Integer likesCount, Integer dislikesCount) {
        this.id = id;
        this.src = src;
        this.title = title;
        this.author = author;
        this.commentsCount = commentsCount;
        this.likesCount = likesCount;
        this.dislikesCount = dislikesCount;
    }

}
