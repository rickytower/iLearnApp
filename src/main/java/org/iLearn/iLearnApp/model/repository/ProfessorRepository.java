package org.iLearn.iLearnApp.model.repository;

import org.iLearn.iLearnApp.model.entity.Professor;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProfessorRepository extends CrudRepository<Professor, Long> {
    Optional<Professor> findByUsername(String username);
}
