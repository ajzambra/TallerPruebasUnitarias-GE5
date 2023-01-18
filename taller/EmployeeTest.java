package taller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void testCsWorkerPar() {
		Employee employee = new Employee(386,"USD",0,EmployeeType.Worker);
		float valor = employee.cs();
		assertEquals(386.00F,valor,0.01);
	}
	
	@Test
	void testCsWorkerImpar() {
		Employee employee = new Employee(386,"USD",0,EmployeeType.Worker);
		float valor = employee.cs();
		assertEquals(402.08F,valor,0.01); 
	}
	
	@Test
	void testCsOtraMoneda() {
		Employee employee = new Employee(400,"EUR",0,EmployeeType.Worker);
		float valor = employee.cs();
		assertEquals(380.00F,valor,0.01); 
	}
	
	@Test
	void testCsSupervisorPar() {
		Employee employee = new Employee(400,"USD",75,EmployeeType.Supervisor);
		float valor = employee.cs();
		assertEquals(426.25F,valor,0.01); 
	}
	
	@Test
	void testCsSupervisorImpar() {
		Employee employee = new Employee(400,"USD",75,EmployeeType.Supervisor);
		float valor = employee.cs();
		assertEquals(442.33F,valor,0.01); 
	}
	
	@Test
	void testCsManagerPar() {
		Employee employee = new Employee(400,"USD",75,EmployeeType.Manager);
		float valor = employee.cs();
		assertEquals(452.5F,valor,0.01); 
	}
	
	@Test
	void testCsManagerImpar() {
		Employee employee = new Employee(400,"USD",75,EmployeeType.Manager);
		float valor = employee.cs();
		assertEquals(468.58F,valor,0.01); 
	}
	
	@Test
	void testCsNoEmployee() {
		Employee employee = new Employee(400,"USD",100,EmployeeType.Secretary);
		float valor = employee.cs();
		assertEquals(0.0F,valor); 
	}
	
	@Test
	void testCalculateYearBonusWorker() {
		Employee employee = new Employee(400,"USD",0,EmployeeType.Worker);
		float valor = employee.CalculateYearBonus();
		assertEquals(386.00F,valor,0.01);
	}
	
	@Test
	void testCalculateYearBonusSupervisor() {
		Employee employee = new Employee(400,"USD",0,EmployeeType.Supervisor);
		float valor = employee.CalculateYearBonus();
		assertEquals(593.00F,valor,0.01);
	}
	
	@Test
	void testCalculateYearBonusManager() {
		Employee employee = new Employee(400,"USD",0,EmployeeType.Manager);
		float valor = employee.CalculateYearBonus();
		assertEquals(786.00F,valor,0.01);
	}
	
	@Test
	void testCalculateYearBonusNoEmployee() {
		Employee employee = new Employee(400,"USD",100,EmployeeType.Secretary);
		float valor = employee.CalculateYearBonus();
		assertEquals(0.0F,valor); 
	}
	
	@Test
	void testCalculateYearBonusOtraMoneda() {
		Employee employee = new Employee(400,"EUR",0,EmployeeType.Worker);
		float valor = employee.CalculateYearBonus();
		assertEquals(366.70F,valor,0.01);
	}
}