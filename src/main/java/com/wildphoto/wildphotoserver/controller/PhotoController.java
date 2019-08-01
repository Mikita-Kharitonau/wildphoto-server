package com.wildphoto.wildphotoserver.controller;

import com.wildphoto.wildphotoserver.model.converters.PhotoMapper;
import com.wildphoto.wildphotoserver.model.converters.PhotoThumbnailMapper;
import com.wildphoto.wildphotoserver.model.dtos.PhotoDTO;
import com.wildphoto.wildphotoserver.model.dtos.PhotoThumbnail;
import com.wildphoto.wildphotoserver.model.Photo;
import com.wildphoto.wildphotoserver.service.DefaultPhotoService;
import com.wildphoto.wildphotoserver.service.PhotoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class PhotoController {

    @Autowired
    private DefaultPhotoService photoService;

    @Autowired
    private PhotoMapper photoMapper;

    @Autowired
    private PhotoThumbnailMapper photoThumbnailMapper;

    @GetMapping(path = "/photos")
    private List<PhotoThumbnail> searchForPhotos() throws InterruptedException {
        Thread.sleep(1000);
        return photoService.getAllPhotos()
                .stream()
                .map(photo -> photoThumbnailMapper.entityToDTO(photo))
                .collect(Collectors.toList());
    }

    @GetMapping(path = "photo/{id}")
    private ResponseEntity<PhotoDTO> searchForPhotos(@PathVariable Long id) throws InterruptedException {
        Thread.sleep(1000);
        Optional<Photo> photoOptional = photoService.getPhotoById(id);
        if (photoOptional.isPresent()) {
            return new ResponseEntity<>(photoMapper.entityToDTO(photoOptional.get()), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
