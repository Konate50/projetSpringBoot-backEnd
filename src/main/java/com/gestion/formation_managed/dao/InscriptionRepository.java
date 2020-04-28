package com.gestion.formation_managed.dao;

import com.gestion.formation_managed.entities.Inscription;
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
public interface InscriptionRepository extends JpaRepository<Inscription, Long> {
    //recherche pas id
    @RestResource(path = "/byAddresse")
    public List<Inscription> findByAddreseContains(@Param("mc") String addresse);

    //recherce pas pagegignation
    @RestResource(path = "/byAddressePage")
    public Page<Inscription> findByAddreseContains(@Param("mc") String addresse, Pageable pageable);

}
