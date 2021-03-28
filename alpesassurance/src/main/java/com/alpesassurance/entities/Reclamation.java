package com.alpesassurance.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Reclamation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_reclamation;
    private String type;
    private String sujet;
    private String libelle;
    private String piece_joint;
    @ManyToOne
    private Utilisateur utilisateur;

}
