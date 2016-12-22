import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

import org.junit.Test;

public class CompanyManagementSystemTest {
	@Test
	public void employeesWithoutParkSpace() {
		// given
		List<Employee> employees = new ArrayList<>();
		employees.add(new SeniorEmployee("Ryan", true, 10));
		employees.add(new SeniorEmployee("Andrew", false, 7));
		employees.add(new SeniorEmployee("Alexander", true, 8));
		employees.add(new SeniorEmployee("Gigi", false, 2));
		employees.add(new SeniorEmployee("Flaviu", false, 3));
		// when
		List<Employee> employeesWithoutParking = CompanyManagementSystem.getEmployeesWithoutParkSpace(employees);
		// then
		List<Employee> correctSortedEmployeesList = new ArrayList<>();
		correctSortedEmployeesList.add(new SeniorEmployee("Gigi", false, 2));
		correctSortedEmployeesList.add(new SeniorEmployee("Flaviu", false, 3));
		correctSortedEmployeesList.add(new SeniorEmployee("Andrew", false, 7));
		Employee employee1 = employeesWithoutParking.get(0);
		Employee employee2 = employeesWithoutParking.get(1);
		Employee employee3 = employeesWithoutParking.get(2);

		assertTrue(employee1.getParkSpace() == employee2.getParkSpace() == employee3.getParkSpace() == false);

	}

	@Test
	public void employeesWithoutParkSpaceInSeniorityOrder() {
		// given
		List<Employee> employees = new ArrayList<>();
		employees.add(new SeniorEmployee("Ryan", true, 10));
		employees.add(new SeniorEmployee("Andrew", false, 7));
		employees.add(new SeniorEmployee("Alexander", true, 8));
		employees.add(new SeniorEmployee("Gigi", false, 2));
		employees.add(new SeniorEmployee("Flaviu", false, 3));
		// when
		List<Employee> employeesWithoutParking = CompanyManagementSystem.getEmployeesWithoutParkSpace(employees);
		// then
		List<Employee> correctSortedEmployeesList = new ArrayList<>();
		correctSortedEmployeesList.add(new SeniorEmployee("Gigi", false, 2));
		correctSortedEmployeesList.add(new SeniorEmployee("Flaviu", false, 3));
		correctSortedEmployeesList.add(new SeniorEmployee("Andrew", false, 7));
		Employee employee1 = employeesWithoutParking.get(0);
		Employee employee2 = employeesWithoutParking.get(1);
		Employee employee3 = employeesWithoutParking.get(2);

		assertTrue(employee1.getSeniority() < employee2.getSeniority());
		assertTrue(employee2.getSeniority() < employee3.getSeniority());

	}

	@Test
	public void onlyEmployeesWithParkSpaces() {
		// given
		List<Employee> employees = new ArrayList<>();
		employees.add(new SeniorEmployee("Ryan", true, 10));
		employees.add(new SeniorEmployee("Andrew", true, 7));
		employees.add(new SeniorEmployee("Alexander", true, 8));
		employees.add(new SeniorEmployee("Gigi", true, 2));
		employees.add(new SeniorEmployee("Flaviu", true, 3));
		// when
		List<Employee> employeesWithoutParking = CompanyManagementSystem.getEmployeesWithoutParkSpace(employees);
		// then
		List<Employee> correctSortedEmployeesList = new ArrayList<>();
		assertTrue(correctSortedEmployeesList.isEmpty());

	}

	@Test(expected = IllegalArgumentException.class)
	public void whenCompanyHasNoEmployees_ExceptionIsThrown() {
		List<Employee> employees = new ArrayList<>();
		List<Employee> employeesWithoutParking = CompanyManagementSystem.getEmployeesWithoutParkSpace(employees);

	}

}
