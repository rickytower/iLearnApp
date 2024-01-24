package org.iLearn.iLearnApp;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import lombok.Getter;
import org.iLearn.iLearnApp.model.entity.*;
import org.iLearn.iLearnApp.model.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Component
public class DBUtils {
    // Specify the path to your JSON file
    private static final String jsonPath = "src/main/resources/jsonData/";
    private static final String professorsFilePath = jsonPath + "professorsData.json";
    private static final String studentsFilePath = jsonPath + "studentsData.json";
    private static final String examsFilePath = jsonPath + "examsData.json";
    private static final String coursesFilePath = jsonPath + "coursesData.json";
    private static final String studentRegistrationPath = jsonPath + "studentRegistrationData.json";

    @Getter
    @Autowired
    private UserRegistredRepository userRegistredRepository;
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private ProfessorRepository professorRepository;

    @Getter
    @Autowired
    private ExamRepository examRepository;
    @Getter
    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private StudentRegistrationRepository studentRegistrationRepository;
    /**
     * Function used to initialize different data from the json files.
     *
     * In particular:
     *      - List<UserRegistred>
     *      - List<Exam>
     *      - List<Course>
     */
    @PostConstruct
    public void initDB(){
        /*Deserializzare il json → popolare il db*/
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            List<Professor> professorList = objectMapper.readValue(new File(professorsFilePath), new TypeReference<>() {
            });

            List<Student> studentList = objectMapper.readValue(new File(studentsFilePath), new TypeReference<>() {
            });
            List<Exam> examList = objectMapper.readValue(new File(examsFilePath), new TypeReference<>() {
            });
            List<Course> courseList = objectMapper.readValue(new File(coursesFilePath), new TypeReference<>() {
            });
            List<StudentRegistration> studentRegistrationList = objectMapper.readValue(new File(studentRegistrationPath), new TypeReference<>() {
            });

            userRegistredRepository.saveAll(professorList);
            userRegistredRepository.saveAll(studentList);
            studentRepository.saveAll(studentList);
            professorRepository.saveAll(professorList);
            examRepository.saveAll(examList);
            courseRepository.saveAll(courseList);
            studentRegistrationRepository.saveAll(studentRegistrationList);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void dropDataDB() {
        userRegistredRepository.deleteAll();
        courseRepository.deleteAll();
        examRepository.deleteAll();
    }
}
