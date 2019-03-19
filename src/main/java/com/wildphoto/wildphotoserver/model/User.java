package com.wildphoto.wildphotoserver.model;

import lombok.Data;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    @Column(name = "avatar_src")
    private String avatarSrc = "photos/noavatar.jpg";

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

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName ="id"))
    private Set<Role> roles = new HashSet<>();

    public User() {}

    public User(@NotBlank String avatarSrc, @NotBlank String name, @NotBlank String username,
                @NotBlank @Email String email, @NotBlank String password, List<Comment> comments,
                List<Like> likes, List<DisLike> dislikes, List<Photo> photos, Set<Role> roles) {
        this.avatarSrc = avatarSrc;
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
        this.comments = comments;
        this.likes = likes;
        this.dislikes = dislikes;
        this.photos = photos;
        this.roles = roles;
    }

    public User(@NotBlank String name, @NotBlank String username,
                @NotBlank @Email String email, @NotBlank String password) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
    }
}