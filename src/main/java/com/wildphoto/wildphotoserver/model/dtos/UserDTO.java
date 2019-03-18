package com.wildphoto.wildphotoserver.model.dtos;

import lombok.Data;

import java.util.List;

@Data
public class UserDTO {

    private Long id;

    private String avatarSrc;

    private String name;

    private String username;

    private String email;

    private List<Long> commentsIds;

    private List<Long> likesIds;

    private List<Long> dislikesIds;

    private List<Long> photosIds;

    public UserDTO(Long id, String avatarSrc, String name, String username,
                   String email, List<Long> commentsIds, List<Long> likesIds,
                   List<Long> dislikesIds, List<Long> photosIds) {
        this.id = id;
        this.avatarSrc = avatarSrc;
        this.name = name;
        this.username = username;
        this.email = email;
        this.commentsIds = commentsIds;
        this.likesIds = likesIds;
        this.dislikesIds = dislikesIds;
        this.photosIds = photosIds;
    }
}
