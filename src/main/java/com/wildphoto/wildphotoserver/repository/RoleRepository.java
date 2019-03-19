package com.wildphoto.wildphotoserver.repository;

import com.wildphoto.wildphotoserver.model.Role;
import com.wildphoto.wildphotoserver.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(RoleName name);
}
