package org.iLearn.iLearnApp.UnitTests;

import org.iLearn.iLearnApp.model.entity.Course;
import org.iLearn.iLearnApp.model.entity.Exam;
import org.iLearn.iLearnApp.model.entity.StudentCareer;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentCareerTests {

    StudentCareer tmpStudentCareer = new StudentCareer();

    @Test
    public void testGetId() {
        assertEquals(null, tmpStudentCareer.getId());
    }

    @Test
    public void testSetId() {
        tmpStudentCareer.setId(1L);
        assertEquals(1L, tmpStudentCareer.getId());
    }

    @Test
    public void testGetTeachingPlan() {
        assertEquals(null, tmpStudentCareer.getTeachingPlan());
    }

    @Test
    public void testSetTeachingPlan() {
        List<Course> newTeachingPlan = new ArrayList<>();
        newTeachingPlan.add(new Course());
        tmpStudentCareer.setTeachingPlan(newTeachingPlan);
        assertEquals(newTeachingPlan, tmpStudentCareer.getTeachingPlan());
    }

    @Test
    public void testGetRecordBook() {
        assertEquals(null, tmpStudentCareer.getRecordBook());
    }

    @Test
    public void testSetRecordBook() {
        List<Exam> newRecordBook = new ArrayList<>();
        newRecordBook.add(new Exam());
        tmpStudentCareer.setRecordBook(newRecordBook);
        assertEquals(newRecordBook, tmpStudentCareer.getRecordBook());
    }

    @Test
    public void testGetTaxes() {
        assertEquals(null, tmpStudentCareer.getTaxes());
    }

    @Test
    public void testSetTaxes() {
        List<Integer> newTaxes = new ArrayList<>();
        newTaxes.add(100);
        tmpStudentCareer.setTaxes(newTaxes);
        assertEquals(newTaxes, tmpStudentCareer.getTaxes());
    }
}
