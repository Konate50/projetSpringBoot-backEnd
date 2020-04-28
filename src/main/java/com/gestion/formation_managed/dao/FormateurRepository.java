package com.gestion.formation_managed.dao;

import com.gestion.formation_managed.entities.Formateur;
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
public interface FormateurRepository extends JpaRepository<Formateur, Long> {
   /* //recherche pas id
    @RestResource(path = "/byName")
    public List<Formateur> findByNameContains(@Param("mc") String name);

    //recherce pas pagegignation
    @RestResource(path = "/byDesignationPage")
    public Page<Formateur> findByNameContains(@Param("mc") String name, Pageable pageable);
*/
}
