package io.swagger.db.repository;

import io.swagger.db.model.SchoolEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<SchoolEntry, Integer> {

}
