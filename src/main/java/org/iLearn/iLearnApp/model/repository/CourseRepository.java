package org.iLearn.iLearnApp.model.repository;

import org.iLearn.iLearnApp.model.entity.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long> {
}
