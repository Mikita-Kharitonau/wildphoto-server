package com.wildphoto.wildphotoserver.model;

import lombok.Data;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(
        name = "users",
        uniqueConstraints = {
            @UniqueConstraint(columnNames = {"username"}),
            @UniqueConstraint(columnNames = {"email"})
        })
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(name = "avatar_src")
    private String avatarSrc;

    @NotBlank
    private String name;

    @NotBlank
    private String username;

    @NaturalId
    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String password;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy = "author")
    private List<Comment> comments;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy = "author")
    private List<Like> likes;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy = "author")
    private List<DisLike> dislikes;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy = "author")
    private List<Photo> photos;

}