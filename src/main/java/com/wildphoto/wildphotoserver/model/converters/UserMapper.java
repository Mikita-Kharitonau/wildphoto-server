package com.wildphoto.wildphotoserver.model.converters;

import com.wildphoto.wildphotoserver.model.*;
import com.wildphoto.wildphotoserver.model.dtos.UserDTO;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class UserMapper implements DefaultMapper<UserDTO, User> {

    @Override
    public UserDTO entityToDTO(User user) {
        return new UserDTO(
                user.getId(),
                user.getAvatarSrc(),
                user.getName(),
                user.getUsername(),
                user.getEmail(),
                user.getComments().stream().map(Comment::getId).collect(Collectors.toList()),
                user.getLikes().stream().map(Like::getId).collect(Collectors.toList()),
                user.getDislikes().stream().map(DisLike::getId).collect(Collectors.toList()),
                user.getPhotos().stream().map(Photo::getId).collect(Collectors.toList())
        );
    }

    @Override
    public User DTOToEntity(UserDTO userDTO) {
        return null;
    }
}
