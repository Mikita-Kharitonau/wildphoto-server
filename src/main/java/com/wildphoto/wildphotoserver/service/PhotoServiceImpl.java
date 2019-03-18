package com.wildphoto.wildphotoserver.service;

import com.wildphoto.wildphotoserver.model.dtos.*;
import com.wildphoto.wildphotoserver.model.Photo;
import com.wildphoto.wildphotoserver.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PhotoServiceImpl implements DefaultPhotoService {

    @Autowired
    private PhotoRepository photoRepository;

    public List<Photo> getAllPhotos() {
        return photoRepository.findAll();
    }

    public Optional<Photo> getPhotoById(Long id) {
        return photoRepository.findById(id);
    }
};
