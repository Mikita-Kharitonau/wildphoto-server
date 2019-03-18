package com.wildphoto.wildphotoserver.model.converters;

import com.wildphoto.wildphotoserver.model.DisLike;
import com.wildphoto.wildphotoserver.model.Photo;
import com.wildphoto.wildphotoserver.model.dtos.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class PhotoMapper implements DefaultMapper<PhotoDTO, Photo> {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private CommentMapper commentMapper;

    @Autowired
    private LikeMapper likeMapper;

    @Autowired
    private DisLikeMapper disLikeMapper;

    @Override
    public PhotoDTO entityToDTO(Photo photo) {
        List<CommentDTO> comments = photo.getComments()
                .stream()
                .map(comment -> commentMapper.entityToDTO(comment))
                .collect(Collectors.toList());
        List<LikeDTO> likes = photo.getLikes()
                .stream()
                .map(like -> likeMapper.entityToDTO(like))
                .collect(Collectors.toList());
        List<DisLikeDTO> dislikes = photo.getDislikes()
                .stream()
                .map(disLike -> disLikeMapper.entityToDTO(disLike))
                .collect(Collectors.toList());
        UserDTO author = userMapper.entityToDTO(photo.getAuthor());
        return new PhotoDTO(
                photo.getId(),
                photo.getTitle(),
                photo.getDate().getTime(),
                photo.getThumbnailSrc(),
                photo.getFullsizeSrc(),
                comments,
                likes,
                dislikes,
                author
        );
    }

    @Override
    public Photo DTOToEntity(PhotoDTO photoDTO) {
        return null;
    }
}