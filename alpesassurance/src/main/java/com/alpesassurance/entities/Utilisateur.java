package com.alpesassurance.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Utilisateur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_utilisateur;
    private String nom;
    private String prenom;
    private Date date_naissance;
    private String sexe;
    private String cin;
    private String telephone;
    private String email;
    private String adresse;
    private String code_postal;
    @OneToMany(mappedBy = "utilisateur")
    private Collection<Message> messages;
    @OneToMany(mappedBy = "utilisateur")
    private Collection<Reclamation> reclamations;
    @OneToMany(mappedBy = "utilisateur")
    private Collection<Devis> devis;
}
