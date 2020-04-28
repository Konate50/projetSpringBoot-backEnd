package com.gestion.formation_managed.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CVFormateur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String addrese;
    private String experiences;
    private String competences;
    private int tel;
    private String langue;
    private String divers;
    private boolean selected;
    @ManyToOne /*(fetch = FetchType.LAZY,cascade = CascadeType.ALL,optional = false)*/
    private Formateur formateur;
    @ManyToOne
    @JoinColumn
    private Formation formation;
    public void setId(long id) {
        this.id = id;
    }
}
