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
public class Formateur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    private String firstname;
    private String lastname;
    private String email;
    private String addres;
    @OneToMany(mappedBy = "formateur")
    private Collection<Formation> formations;
    @OneToOne
    private CVFormateur CVFormateur;
    @OneToMany(mappedBy = "formateur")
    private Collection<AlerteMessage> alerteMessage;

}
