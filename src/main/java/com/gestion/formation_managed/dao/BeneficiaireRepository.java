package com.gestion.formation_managed.dao;

import com.gestion.formation_managed.entities.Beneficiaire;
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
public interface BeneficiaireRepository extends JpaRepository<Beneficiaire, Long> {
   /* //recherche pas id
    @RestResource(path = "/byName")
    public List<Beneficiaire> findByNameContains(@Param("mc") String des);

    //recherce pas pagegignation
    @RestResource(path = "/byNamePage")
    public Page<Beneficiaire> findByNameContains(@Param("mc") String des, Pageable pageable);
*/
}
