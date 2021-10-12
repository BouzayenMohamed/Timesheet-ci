package tn.esprit.spring.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.services.EmployeServiceImpl;
import tn.esprit.spring.services.EntrepriseServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EntrepriseServiceImplTest {
	@Autowired
	EntrepriseServiceImpl ent_sev;
	
	
	@Test
	public void testretrieveAllEmployes(){
		assertEquals(1,ent_sev.retrieveAllEntreprise() );

	}
	
	@Test
	public void testAddEmploye()  {
		
	
		Entreprise ent = new Entreprise("esprit","esprit"); 
		Entreprise entAdded = ent_sev.addEntreprise(ent); 
		assertNotNull(entAdded);
		
		//Assert.assertEquals(emp.getId(), userAdded.getLastName());
	}
}
