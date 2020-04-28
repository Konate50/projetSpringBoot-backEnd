package com.gestion.formation_managed.dao;

import com.gestion.formation_managed.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("*")
@RepositoryRestResource
public interface UserRespository extends JpaRepository<User, Long> {
    //recherche pas id
    @RestResource(path = "/byFirstname")
    public List<User> findByFirstnameContains(@Param("mc") String firstnane);

    //recherce pas pagegignation
    @RestResource(path = "/byFirstnamePage")
    public Page<User> findByFirstnameContains(@Param("mc") String firstnane, Pageable pageable);

}
