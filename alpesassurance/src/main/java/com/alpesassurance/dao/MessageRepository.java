package com.alpesassurance.dao;

import com.alpesassurance.entities.Administrateur;
import com.alpesassurance.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource

public interface MessageRepository extends JpaRepository<Message,Long> {
}
