package com.wildphoto.wildphotoserver.model.converters;

import com.wildphoto.wildphotoserver.model.Photo;
import com.wildphoto.wildphotoserver.model.dtos.PhotoThumbnail;
import org.springframework.stereotype.Component;


@Component
public class PhotoThumbnailMapper implements DefaultMapper<PhotoThumbnail, Photo> {

    @Override
    public PhotoThumbnail entityToDTO(Photo photo) {
        return new PhotoThumbnail(
                photo.getId(),
                photo.getThumbnailSrc(),
                photo.getTitle(),
                photo.getAuthor().getName(),
                photo.getComments().size(),
                photo.getLikes().size(),
                photo.getDislikes().size()
        );
    }

    @Override
    public Photo DTOToEntity(PhotoThumbnail dto) {
        return null;
    }
}
