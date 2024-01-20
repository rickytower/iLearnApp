package org.iLearn.iLearnApp.UnitTests;

import org.iLearn.iLearnApp.model.entity.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExamTests  {

    Course tmpCourse = new Course(
            1,
            new ArrayList<>(), // Empty exam list for simplicity, you can populate it as needed
            5,
            "Mathematics",
            CourseType.COMPULSORY);

    Exam tmpExam = new Exam(
            1L,
            "MathExam",
            ExamTypeMethod.ORAL,
            new Date(System.currentTimeMillis())
    );

    @Test
    public void testSetGetName() {
        tmpExam.setName("PhysicsExam");
        assertEquals("PhysicsExam", tmpExam.getName());
    }

    @Test
    public void testSetGetExamTypeMethod() {
        tmpExam.setExamTypeMethod(ExamTypeMethod.WRITTEN);
        assertEquals(ExamTypeMethod.WRITTEN, tmpExam.getExamTypeMethod());
    }

    @Test
    public void testSetGetExamDate() {
        Date newExamDate = new Date(System.currentTimeMillis() + 86400000); // Adding one day
        tmpExam.setExamDate(newExamDate);
        assertEquals(newExamDate, tmpExam.getExamDate());
    }

    @Test
    public void testSetGetCourse() {
        tmpExam.setCourse(tmpCourse);
        assertEquals(tmpCourse, tmpExam.getCourse());
    }

    @Test
    public void testSetGetGrade() {
        tmpExam.setGrade(90);
        assertEquals(90, tmpExam.getGrade());
    }

    @Test
    public void testSetGetStatus() {
        tmpExam.setStatus(ExamStatus.ACCEPTED);
        assertEquals(ExamStatus.ACCEPTED, tmpExam.getStatus());
    }

    @Test
    public void testSetGetId() {
        tmpExam.setId(2L);
        assertEquals(2L, tmpExam.getId());
    }
}
