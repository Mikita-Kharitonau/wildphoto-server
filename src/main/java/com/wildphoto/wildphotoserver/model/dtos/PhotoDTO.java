package com.wildphoto.wildphotoserver.model.dtos;

import com.wildphoto.wildphotoserver.model.DisLike;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class PhotoDTO {

    private Long id;

    private String title;

    private Long date;

    private String thumbnailSrc;

    private String fullsizeSrc;

    private List<CommentDTO> comments;

    private List<LikeDTO> likes;

    private List<DisLikeDTO> dislikes;

    private UserDTO author;

    public PhotoDTO(Long id, String title, Long date, String thumbnailSrc, String fullsizeSrc, List<CommentDTO> comments, List<LikeDTO> likes, List<DisLikeDTO> dislikes, UserDTO author) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.thumbnailSrc = thumbnailSrc;
        this.fullsizeSrc = fullsizeSrc;
        this.comments = comments;
        this.likes = likes;
        this.dislikes = dislikes;
        this.author = author;
    }
}
