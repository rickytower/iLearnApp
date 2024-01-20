package org.iLearn.iLearnApp;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.catalina.User;
import org.iLearn.iLearnApp.model.entity.Course;
import org.iLearn.iLearnApp.model.entity.Exam;
import org.iLearn.iLearnApp.model.entity.UserRegistred;
import org.iLearn.iLearnApp.model.repository.CourseRepository;
import org.iLearn.iLearnApp.model.repository.ExamRepository;
import org.iLearn.iLearnApp.model.repository.UserRegistredRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static io.restassured.RestAssured.given;

@Component
public class Utils {
    // Specify the path to your JSON file
    private static final String jsonPath = "src/main/resources/jsonData/";
    private static final String studentsFilePath = jsonPath + "usersRegistredData.json";
    private static final String examsFilePath = jsonPath + "examsData.json";
    private static final String coursesFilePath = jsonPath + "coursesData.json";

    @Autowired
    private UserRegistredRepository userRegistredRepository;
    @Autowired
    private ExamRepository examRepository;
    @Autowired
    private CourseRepository courseRepository;

    /**
     * Function used to initialize different data from the json files.
     *
     * In particular:
     *      - List<UserRegistred>
     *      - List<Exam>
     *      - List<Course>
     * @throws IOException
     */
    public void initDB(){
        /*Deserializzare il json → popolare il db*/
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            List<UserRegistred> userRegistredList = objectMapper.readValue(new File(studentsFilePath), new TypeReference<>() {
            });
            List<Exam> examList = objectMapper.readValue(new File(examsFilePath), new TypeReference<>() {
            });
            List<Course> courseList = objectMapper.readValue(new File(coursesFilePath), new TypeReference<>() {
            });
            userRegistredRepository.saveAll(userRegistredList);
            examRepository.saveAll(examList);
            courseRepository.saveAll(courseList);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public UserRegistredRepository getUserRegistredRepository() {
        return userRegistredRepository;
    }

    public CourseRepository getCourseRepository() {
        return courseRepository;
    }

    public ExamRepository getExamRepository() {
        return examRepository;
    }
}
