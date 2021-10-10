package tn.esprit.spring.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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
	public void testretrieveAllEmployes(){
		assertEquals(1,emp_sev.retrieveAllEmployes() );

	}
	
	@Test
	public void testAddEmploye()  {
		
	
		Employe emp = new Employe("Bouzayen", "Mohamed","",true, Role.INGENIEUR); 
		Employe empAdded = emp_sev.addEmploye(emp); 
		assertNotNull(empAdded);
		
		//Assert.assertEquals(emp.getId(), userAdded.getLastName());
	}
 

}
