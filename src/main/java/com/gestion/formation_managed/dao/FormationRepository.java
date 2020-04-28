package com.gestion.formation_managed.dao;

import com.gestion.formation_managed.entities.Formation;
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
public interface FormationRepository extends JpaRepository<Formation, Long> {
    //recherche pas id
    @RestResource(path = "/byFormation")
    public List<Formation> findByLibeleContains(@Param("mc") String libel);

    //recherce pas pagegignation
    @RestResource(path = "/byFormationPage")
    public Page<Formation> findByLibeleContains(@Param("mc") String libel, Pageable pageable);
    @RestResource(path="farmateurId")
    public List<Formation> findByFormateurId(@Param("id") String id);

}
