package org.iLearn.iLearnApp.model.repository;

import org.iLearn.iLearnApp.model.entity.StudentRegistration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface StudentRegistrationRepository extends CrudRepository<StudentRegistration,Long> {

}
