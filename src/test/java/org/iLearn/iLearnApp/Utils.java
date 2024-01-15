package org.iLearn.iLearnApp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.minidev.json.writer.JsonReader;
import org.apache.catalina.User;
import org.iLearn.iLearnApp.model.entity.Student;
import org.iLearn.iLearnApp.model.entity.UserRegistred;
import org.iLearn.iLearnApp.model.repository.UserRegistredRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.annotation.Commit;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

@Component
public class Utils {
    // Specify the path to your JSON file
    private static final String filePath = "src/main/resources/studentsData.json";

    @Autowired
    private UserRegistredRepository userRegistredRepository;

    public void initDB() throws IOException {
        /*Deserializzare il json → popolare il db*/
        File file = new File(filePath);
        TypeReference<List<UserRegistred>> typeReference = new TypeReference<List<UserRegistred>>() {};
        List<UserRegistred> userRegistredList = new ObjectMapper().readValue(file, typeReference);

        // Save each user entity to the repository
        for (UserRegistred userRegistred : userRegistredList) {
            userRegistredRepository.save(userRegistred);
        }

    }
}
