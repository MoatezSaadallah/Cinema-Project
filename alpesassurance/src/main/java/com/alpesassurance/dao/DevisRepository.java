package com.alpesassurance.dao;

import com.alpesassurance.entities.Administrateur;
import com.alpesassurance.entities.Devis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource

public interface DevisRepository extends JpaRepository<Devis,Long> {
}
