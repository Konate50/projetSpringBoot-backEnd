package com.gestion.formation_managed.dao;

import com.gestion.formation_managed.entities.ElementForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("*")
@RepositoryRestResource
public interface ElementsRepository extends JpaRepository<ElementForm,Long> {
    @RestResource(path = "/elementSelected")
    public List<ElementForm> findBySelectedIsTrue();
    @RestResource(path = "/elementsByKeyword")
    //@Query("select  e FROM Element e where e.name like :x")
    //public List<Element> chercher(@Param("x") String mc);
    public List<ElementForm> findByNameContains(@Param("mc") String mc);
}
