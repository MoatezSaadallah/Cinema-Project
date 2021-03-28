package com.alpesassurance.dao;

import com.alpesassurance.entities.Administrateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource

public interface AdministrateurRepository extends JpaRepository<Administrateur,Long> {
}
