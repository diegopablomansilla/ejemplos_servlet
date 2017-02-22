package org.yacare;

import java.util.UUID;

import org.codehaus.jackson.map.ObjectMapper;
import org.yacare.bo.LegalGuardianBo;
import org.yacare.model.academic.student.Student;
import org.yacare.model.person.Gender;
import org.yacare.model.person.Person;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		try {

			Gender genderM = new Gender();
			genderM.setId(UUID.randomUUID().toString());
			genderM.setErased(false);
			genderM.setCode("M");
			genderM.setName("Masculino");
			genderM.setDescription("Sexo masculino");

			Gender genderF = new Gender();
			genderF.setId(UUID.randomUUID().toString());
			genderF.setErased(false);
			genderF.setCode("F");
			genderF.setName("Femenino");
			genderF.setDescription("Sexo femenino");

			Person person = new Person();
			person.setId(UUID.randomUUID().toString());
			person.setErased(false);
			person.setNames(new String[] { "Diego", "Pablo" });
			person.setLastNames(new String[] { "Mansilla", "Cendra" });
			person.setGender(genderM);

//			ObjectMapper mapper = new ObjectMapper();
//			String json = mapper.writeValueAsString(person);
//
//			person = mapper.readValue(json, Person.class);
//			person.setGender(genderF);
//
//			json = mapper.writeValueAsString(person);
//
//			System.out.println(json);

		} catch (Exception e) {
			e.printStackTrace();

		}
		
		LegalGuardianBo bo = new LegalGuardianBo();
		try {
			bo.init();
			
			
//			Person person = bo.getPersonById("31438562-21c3-47fa-a211-6c97262894b5");
			
//			Person person = bo.getPersonById("ff80818144e5b96d0144e5b9f28e00a0");
			
//			Person person = bo.getPersonById("2c9090b54c51ec03014cdc4504850211");
			
//			Person person = bo.getPersonById("2c9090b544db0f6f0144e5dc909d0882");
			
			Student student = bo.getStudentById("ff80818144e5b96d0144e5b9f28e00a0");
			
			
			ObjectMapper mapper = new ObjectMapper();
			String json = mapper.writeValueAsString(student);
			System.out.println(json);

		} catch (Exception e) {
			e.printStackTrace();
		}

//		FamilyGroupBo bo = new FamilyGroupBo();
//		try {
//			bo.init();
//			FamilyGroup familyGroup = bo.getFamilyGroupByUserId("31438562-21c3-47fa-a211-6c97262894b5");
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

	}
}
