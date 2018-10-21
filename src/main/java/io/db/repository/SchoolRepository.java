package io.db.repository;

import io.db.model.SchoolEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<SchoolEntry, Integer> {

}
