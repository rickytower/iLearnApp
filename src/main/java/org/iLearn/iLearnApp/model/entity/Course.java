package org.iLearn.iLearnApp.model.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Course {
    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /**
     * Rappresents the semester (autumn or spring).
     */
    @Enumerated(EnumType.STRING)
    private Semester semester;

    /**
     * Rappresents the list of exam for each course
     */
    @OneToMany
    private List<Exam> examList;

    /**
     * Rappresents the total CFU for each course
     */
    private Integer cfu;

    private String courseName;
    @Enumerated(EnumType.STRING)
    private CourseType courseType;


    @JsonCreator
    public Course(@JsonProperty("semester") Semester semester,
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
}


