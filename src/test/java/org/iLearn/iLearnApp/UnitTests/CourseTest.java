package org.iLearn.iLearnApp.UnitTests;

import org.iLearn.iLearnApp.model.entity.Course;
import org.iLearn.iLearnApp.model.entity.CourseType;
import org.iLearn.iLearnApp.model.entity.Exam;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CourseTest {

    Course tmpCourse = new Course(
            0,
            new ArrayList<>(),
            5,
            "Mathematics",
            CourseType.COMPULSORY
    );

    @Test
    public void testGetId() {
        assertEquals(null, tmpCourse.getId());
    }

    @Test
    public void testSetId() {
        tmpCourse.setId(2L);
        assertEquals(2L, tmpCourse.getId());
    }

    @Test
    public void testGetSemester() {
        assertEquals(1, tmpCourse.getSemester());
    }

    @Test
    public void testSetSemester() {
        tmpCourse.setSemester(1);
        assertEquals(1, tmpCourse.getSemester());
    }

    @Test
    public void testGetExamList() {
        assertEquals(new ArrayList<>(), tmpCourse.getExamList());
    }

    @Test
    public void testSetExamList() {
        List<Exam> newExamList = new ArrayList<>();
        newExamList.add(new Exam());
        tmpCourse.setExamList(newExamList);
        assertEquals(newExamList, tmpCourse.getExamList());
    }

    @Test
    public void testGetCfu() {
        assertEquals(5, tmpCourse.getCfu());
    }

    @Test
    public void testSetCfu() {
        tmpCourse.setCfu(7);
        assertEquals(7, tmpCourse.getCfu());
    }

    @Test
    public void testGetCourseName() {
        assertEquals("Mathematics", tmpCourse.getCourseName());
    }

    @Test
    public void testSetCourseName() {
        tmpCourse.setCourseName("Physics");
        assertEquals("Physics", tmpCourse.getCourseName());
    }

    @Test
    public void testGetCourseType() {
        assertEquals(CourseType.COMPULSORY, tmpCourse.getCourseType());
    }

    @Test
    public void testSetCourseType() {
        tmpCourse.setCourseType(CourseType.OPTIONAL);
        assertEquals(CourseType.OPTIONAL, tmpCourse.getCourseType());
    }
}
