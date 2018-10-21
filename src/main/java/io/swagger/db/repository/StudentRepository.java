package io.swagger.db.repository;

import io.swagger.db.model.StudentEntry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<StudentEntry, Integer> {
    List<StudentEntry> findByFirstName(String name);

}
