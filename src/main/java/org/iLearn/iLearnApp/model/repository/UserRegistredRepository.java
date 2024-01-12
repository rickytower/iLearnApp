package org.iLearn.iLearnApp.model.repository;

import org.iLearn.iLearnApp.model.entity.UserRegistred;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRegistredRepository extends CrudRepository<UserRegistred, Long>{
    Optional<UserRegistred> findByUsernameAndPassword(String username, String password);
}
