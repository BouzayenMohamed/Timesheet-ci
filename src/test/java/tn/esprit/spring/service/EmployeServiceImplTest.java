package tn.esprit.spring.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.services.EmployeServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeServiceImplTest {
	
	@Autowired
	EmployeServiceImpl emp_sev;
	
	@Test
	public void testAddEmploye()  {
		
	
		Employe emp = new Employe("Bouzayen", "Mohamed","",true, Role.INGENIEUR); 
		Employe empAdded = emp_sev.addEmploye(emp); 
		Assert.assertEquals(emp.getNom(), empAdded.getNom());
	}
	@Test
	public void testretrieveAllEmployes(){
		assertTrue(emp_sev.retrieveAllEmployes().size()>1);
	
		

	}
	
	
 

}
