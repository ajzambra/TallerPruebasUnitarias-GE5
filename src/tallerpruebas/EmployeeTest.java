package tallerpruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test 
	//Comprueba si mes es par(Worker) - Metodo cs
	void testCsWorkerPar() {
		Employee employee = new Employee(386,"USD",0,EmployeeType.Worker);
		float valor = employee.cs();
		assertEquals(386.00F,valor,0.01);
	}
	
	@Test 
	//Comprueba si mes es impar(Worker) - Metodo cs
	void testCsWorkerImpar() {
		Employee employee = new Employee(386,"USD",0,EmployeeType.Worker);
		float valor = employee.cs();
		assertEquals(402.08F,valor,0.01); 
	}
	
	@Test
	//Comprueba otra moneda(Worker) - Metodo cs
	void testCsOtraMoneda() {
		Employee employee = new Employee(400,"EUR",0,EmployeeType.Worker);
		float valor = employee.cs();
		assertEquals(380.00F,valor,0.01); 
	}
	
	@Test
	//Comprueba si el empleado es supervisor, mes par(Supervisor) - Metodo cs
	void testCsSupervisorPar() {
		Employee employee = new Employee(400,"USD",75,EmployeeType.Supervisor);
		float valor = employee.cs();
		assertEquals(426.25F,valor,0.01); 
	}
	
	@Test
	//Comprueba si el empleado es supervisor, mes impar(Supervisor) - Metodo cs
	void testCsSupervisorImpar() {
		Employee employee = new Employee(400,"USD",75,EmployeeType.Supervisor);
		float valor = employee.cs();
		assertEquals(442.33F,valor,0.001); 
	}
	
	@Test
	//Comprueba si el empleado es manager, mes par(Manager) - Metodo cs
	void testCsManagerPar() {
		Employee employee = new Employee(400,"USD",75,EmployeeType.Manager);
		float valor = employee.cs();
		assertEquals(452.5F,valor,0.01); 
	}
	
	@Test
	//Comprueba si el empleado es manager, mes impar(Manager) - Metodo cs
	void testCsManagerImpar() {
		Employee employee = new Employee(400,"USD",75,EmployeeType.Manager);
		float valor = employee.cs();
		assertEquals(468.58F,valor,0.01); 
	}
	
	@Test
	//Comprueba no valido(Secretary) - Metodo cs
	void testCsNoEmployee() {
		Employee employee = new Employee(400,"USD",100,EmployeeType.Secretary);
		float valor = employee.cs();
		assertEquals(0.0F,valor); 
	}
	
	@Test
	//Calculo de bonus anual de empleado Worker - Metodo CalculateYearBonus
	void testCalculateYearBonusWorker() {
		Employee employee = new Employee(400,"USD",0,EmployeeType.Worker);
		float valor = employee.CalculateYearBonus();
		assertEquals(386.00F,valor,0.01);
	}
	
	@Test
	//Calculo de bonus anual de empleado Supervisor - Metodo CalculateYearBonus
	void testCalculateYearBonusSupervisor() {
		Employee employee = new Employee(400,"USD",0,EmployeeType.Supervisor);
		float valor = employee.CalculateYearBonus();
		assertEquals(593.00F,valor,0.01);
	}
	
	@Test
	//Calculo de bonus anual de empleado Manager - Metodo CalculateYearBonus
	void testCalculateYearBonusManager() {
		Employee employee = new Employee(400,"USD",0,EmployeeType.Manager);
		float valor = employee.CalculateYearBonus();
		assertEquals(786.00F,valor,0.01);
	}
	
	@Test
	//Calculo de bonus anual de empleado Secretary - Metodo CalculateYearBonus
	void testCalculateYearBonusNoEmployee() {
		Employee employee = new Employee(400,"USD",100,EmployeeType.Secretary);
		float valor = employee.CalculateYearBonus();
		assertEquals(0.0F,valor); 
	}
	
	@Test
	//Calculo de bonus anual de empleado Worker - Metodo CalculateYearBonus
	void testCalculateYearBonusOtraMoneda() {
		Employee employee = new Employee(400,"EUR",0,EmployeeType.Worker);
		float valor = employee.CalculateYearBonus();
		assertEquals(366.70F,valor,0.01);
	}
}
