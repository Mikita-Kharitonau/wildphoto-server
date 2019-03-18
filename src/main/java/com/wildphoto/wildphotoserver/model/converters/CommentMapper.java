package com.wildphoto.wildphotoserver.model.converters;

import com.wildphoto.wildphotoserver.model.Comment;
import com.wildphoto.wildphotoserver.model.dtos.CommentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommentMapper implements DefaultMapper<CommentDTO, Comment> {

    @Autowired
    private UserMapper userMapper;

    @Override
    public CommentDTO entityToDTO(Comment comment) {
        return new CommentDTO(
                comment.getId(),
                comment.getText(),
                comment.getDate(),
                userMapper.entityToDTO(comment.getAuthor()),
                comment.getPhoto().getId()
        );
    }

    @Override
    public Comment DTOToEntity(CommentDTO commentDTO) {
        return null;
    }
}
