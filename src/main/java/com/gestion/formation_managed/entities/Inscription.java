package com.gestion.formation_managed.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Inscription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String addrese;
    private String email;
    private int tel;
    private String elementName;
    @ManyToOne/*(fetch = FetchType.LAZY,cascade = CascadeType.ALL,optional = false)*/
    @JoinColumn
    private ElementForm element;
}
