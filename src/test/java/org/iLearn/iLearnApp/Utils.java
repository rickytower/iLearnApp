package org.iLearn.iLearnApp;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.iLearn.iLearnApp.model.entity.UserRegistred;
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

    @Autowired
    private UserRegistredRepository userRegistredRepository;

    public void initDB() throws IOException {
        /*Deserializzare il json → popolare il db*/
        File file = new File(studentsFilePath);
        TypeReference<List<UserRegistred>> typeReference = new TypeReference<List<UserRegistred>>() {
        };
        List<UserRegistred> userRegistredList = new ObjectMapper().readValue(file, typeReference);

        userRegistredRepository.saveAll(userRegistredList);

    }
}
