package com.wildphoto.wildphotoserver.service;

import com.wildphoto.wildphotoserver.model.Photo;

import java.util.List;
import java.util.Optional;

public interface DefaultPhotoService {

    List<Photo> getAllPhotos();

    Optional<Photo> getPhotoById(Long id);

}
