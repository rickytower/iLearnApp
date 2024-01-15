package org.iLearn.iLearnApp;

import io.restassured.RestAssured;
import org.iLearn.iLearnApp.model.entity.UserRegistred;
import org.iLearn.iLearnApp.model.repository.UserRegistredRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class ILearnAppApplicationTests {
	@Autowired UserRegistredRepository userRegistredRepository;
	@BeforeAll
	/*
	 * This method, with annotation @BeforeAll, is executed one time at the beginning of the testing session.
	 */
	public static void setUp() throws IOException {
		RestAssured.baseURI = "http://localhost:8080";
		Utils.initDB();
	}
	@Test
	@DirtiesContext(methodMode = DirtiesContext.MethodMode.AFTER_METHOD)
	public void login(){
		Optional<UserRegistred> userRegistredList = userRegistredRepository.findByUsernameAndPassword("","");
	}

}
