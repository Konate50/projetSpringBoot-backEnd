package com.gestion.formation_managed.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ElementForm implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int id;
    private String objectif;
    private String schooleName;
    private int numberPlace;
    private String duree;
    private String description;
    private String name;
    private double price;
    private String time;
    private boolean selected;
    @ManyToOne/*(fetch = FetchType.LAZY,cascade = CascadeType.ALL,optional = false)*/
    @JoinColumn
    private Formation format;
    @OneToMany(mappedBy = "element")
    private Collection<Inscription> inscriptions;
}
