package com.wildphoto.wildphotoserver.repository;

import com.wildphoto.wildphotoserver.model.Photo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhotoRepository extends JpaRepository<Photo, Long> {
}
