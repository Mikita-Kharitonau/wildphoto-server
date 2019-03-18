package com.wildphoto.wildphotoserver.model.converters;

import com.wildphoto.wildphotoserver.model.DisLike;
import com.wildphoto.wildphotoserver.model.dtos.DisLikeDTO;
import org.springframework.stereotype.Component;


@Component
public class DisLikeMapper implements DefaultMapper<DisLikeDTO, DisLike> {

    @Override
    public DisLikeDTO entityToDTO(DisLike disLike) {
        return new DisLikeDTO(disLike.getId(), disLike.getPhoto().getId(), disLike.getAuthor().getId());
    }

    @Override
    public DisLike DTOToEntity(DisLikeDTO disLikeDTO) {
        return null;
    }
}
