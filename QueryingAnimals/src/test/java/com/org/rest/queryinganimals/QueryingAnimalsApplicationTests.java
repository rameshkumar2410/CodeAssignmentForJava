package com.org.rest.queryinganimals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.org.rest.queryinganimals.controller.QueryingAnimalController;
import com.org.rest.queryinganimals.model.Animal;
import com.org.rest.queryinganimals.model.Bird;
import com.org.rest.queryinganimals.model.Dog;
import com.org.rest.queryinganimals.service.AnimalService;

@SpringBootTest
class QueryingAnimalsApplicationTests {

	@InjectMocks
	QueryingAnimalController animalController;
	
	@Mock
	AnimalService animalService;
	
	@Test
	public void getQueryTest() {
		
		List<com.org.rest.queryinganimals.model.Animal> animalList=new ArrayList<>();
		animalList.add(new com.org.rest.queryinganimals.model.Animal(new Bird("American Parrot"), new Dog("Pitbull")));
		animalList.add(new com.org.rest.queryinganimals.model.Animal(new Bird("Indian Parrot"), new Dog("LabourDog")));
		when(animalService.getAnimalList()).then(animalList);
		ResponseEntity<List<Animal>> response=animalController.getAnimalList();
		assertThat(response.getStatusCode().equals(HttpStatus.OK));

}
