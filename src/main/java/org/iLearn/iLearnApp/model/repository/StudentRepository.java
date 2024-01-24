package org.iLearn.iLearnApp.model.repository;

import org.iLearn.iLearnApp.model.entity.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface StudentRepository extends CrudRepository<Student, Long> {
    Optional<Student> findByUsername(String username);
}
