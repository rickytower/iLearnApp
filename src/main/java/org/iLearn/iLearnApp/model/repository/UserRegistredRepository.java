package org.iLearn.iLearnApp.model.repository;

import org.iLearn.iLearnApp.model.entity.UserRegistred;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRegistredRepository extends CrudRepository<UserRegistred, Long>{

    /**
     * Return the user in the repo with the correspondent username.
     *
     * @param username
     * @return
     */
    Optional<UserRegistred> findByUsername(String username);

    /**
     * Return the user in the repo with the correspondent password and username.
     *
     * @param username
     * @param password
     * @return
     */
    Optional<UserRegistred> findByUsernameAndPassword(String username, String password);
}
