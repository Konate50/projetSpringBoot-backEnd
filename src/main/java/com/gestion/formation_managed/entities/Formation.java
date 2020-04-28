package com.gestion.formation_managed.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Formation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String libele;
    private Date date;
    private String schooleName;
    private int price;
    @OneToMany(mappedBy = "formationB")
    private Collection<Beneficiaire> beneficiaires;
    @ManyToOne
    private Formateur formateur;
    @OneToMany(mappedBy = "formationE")
    private Collection<Evaluation> evaluations;
    @OneToMany(mappedBy = "format")
    private Collection<ElementForm> elementForms;
    @OneToMany(mappedBy = "formation")
    private Collection<CVFormateur> cvFormateurs;

    public void setId(long id) {
        this.id = id;
    }
}
