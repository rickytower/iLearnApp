package org.iLearn.iLearnApp.model.entity;

import java.util.List;

public class StudentCareer {
    private List<Course> teachingPlan;
    private List<Exam> recordBook;
    private List<Integer> taxes;

    private final Student student;

    public StudentCareer(Student student){
        this.student = student;
    }

    public List<Course> getTeachingPlan() {
        return teachingPlan;
    }

    public List<Exam> getRecordBook() {
        return recordBook;
    }

    public List<Integer> getTaxes() {
        return taxes;
    }

    public void updateStudentCarrer(){/*da implementare*/}
}
