package org.iLearn.iLearnApp;

import io.restassured.RestAssured;
import org.iLearn.iLearnApp.model.entity.UserRegistred;
import org.iLearn.iLearnApp.model.repository.UserRegistredRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertFalse;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ILearnAppApplicationTests {
	@Autowired
	private Utils utils;

	@Autowired
	private UserRegistredRepository userRegistredRepository;

	@BeforeAll
	void setUp() throws IOException {
		RestAssured.baseURI = "http://localhost:8080";
		utils.initDB();
	}

	@Test
	@DirtiesContext(methodMode = DirtiesContext.MethodMode.AFTER_METHOD)
	public void login() {
		Optional<UserRegistred> userRegistredList = userRegistredRepository.findByUsernameAndPassword("john.doe", "password123");
		assertFalse(userRegistredList.isEmpty());
	}
}
