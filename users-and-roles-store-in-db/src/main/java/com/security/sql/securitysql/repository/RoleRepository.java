package com.security.sql.securitysql.repository;

import com.security.sql.securitysql.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByTitle(String username);

}
