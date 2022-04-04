package io.tomcode.j4rent.core.repositories;

import io.tomcode.j4rent.core.entities.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface DocumentRepository extends JpaRepository<Document, UUID> {
    Document findDocumentById(UUID uuid);
}