package io.swagger.db.repository;

import io.swagger.db.model.UsersEntry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsersRepository extends JpaRepository<UsersEntry, Integer> {
    List<UsersEntry> findByName(String name);

}
