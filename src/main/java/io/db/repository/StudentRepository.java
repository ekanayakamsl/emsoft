package io.db.repository;

import io.db.model.StudentEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<StudentEntry, Integer> {
    List<StudentEntry> findByFirstName(String name);
}
