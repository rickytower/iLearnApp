package org.iLearn.iLearnApp.model.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.List;
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /**
     * Rappresents the semester for each year, 0 for autumn, 1 for spring.
     */
    private int semester;

    /**
     * Rappresents the list of exam for each course
     */
    @OneToMany(mappedBy = "course")
    private List<Exam> examList;

    /**
     * Rappresents the total CFU for each course
     */
    private int cfu;

    private String courseName;
    private CourseType courseType;

    public Course() {
    }

    @JsonCreator
    public Course(@JsonProperty("semester") int semester,
                  @JsonProperty("examList") List<Exam> examList,
                  @JsonProperty("cfu") int cfu,
                  @JsonProperty("courseName") String courseName,
                  @JsonProperty("courseType") CourseType courseType) {
        this.semester = semester;
        this.examList = examList;
        this.cfu = cfu;
        this.courseName = courseName;
        this.courseType = courseType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public List<Exam> getExamList() {
        return examList;
    }

    public void setExamList(List<Exam> examList) {
        this.examList = examList;
    }

    public int getCfu() {
        return cfu;
    }

    public void setCfu(int cfu) {
        this.cfu = cfu;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public CourseType getCourseType() {
        return courseType;
    }

    public void setCourseType(CourseType courseType) {
        this.courseType = courseType;
    }
}
