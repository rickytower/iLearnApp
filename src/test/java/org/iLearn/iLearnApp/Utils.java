package org.iLearn.iLearnApp;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.iLearn.iLearnApp.model.entity.Exam;
import org.iLearn.iLearnApp.model.entity.UserRegistred;
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
    private static final String studentsFilePath = "src/main/resources/studentsData.json";
    private static final String examsFilePath = "src/main/resources/examsData.json";

    @Autowired
    private UserRegistredRepository userRegistredRepository;
    @Autowired
    private ExamRepository examRepository;

    public void initDB() throws IOException {
        /*Deserializzare il json → popolare il db*/
        ObjectMapper objectMapper = new ObjectMapper();
        List<UserRegistred> userRegistredList = objectMapper.readValue(new File(studentsFilePath), new TypeReference<List<UserRegistred>>() {
        });
        List<Exam> examList = objectMapper.readValue(new File(examsFilePath), new TypeReference<List<Exam>>() {
        });

        userRegistredRepository.saveAll(userRegistredList);
        examRepository.saveAll(examList);

    }

    public UserRegistredRepository getUserRegistredRepository() {
        return userRegistredRepository;
    }

    public ExamRepository getExamRepository() {
        return examRepository;
    }
}
