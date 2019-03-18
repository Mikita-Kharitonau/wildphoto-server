package com.wildphoto.wildphotoserver.model.converters;

import com.wildphoto.wildphotoserver.model.Like;
import com.wildphoto.wildphotoserver.model.dtos.LikeDTO;
import org.springframework.stereotype.Component;

@Component
public class LikeMapper implements DefaultMapper<LikeDTO, Like> {

    @Override
    public LikeDTO entityToDTO(Like like) {
        return new LikeDTO(like.getId(), like.getPhoto().getId(), like.getAuthor().getId());
    }

    @Override
    public Like DTOToEntity(LikeDTO likeDTO) {
        return null;
    }
}
