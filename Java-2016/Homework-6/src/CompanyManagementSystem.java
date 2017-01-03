import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * This is the main class , where we create objects and put them into a map.
 * 
 * @author Flaviu
 *
 */
public class CompanyManagementSystem {

	public static void main(String[] args) {

		Map<String, List<Employee>> employeeMap = new HashMap<String, List<Employee>>();

		List<Employee> employeeJuniorList = new ArrayList<Employee>();

		employeeJuniorList.add(new JuniorEmployee("John", false, 2));
		employeeJuniorList.add(new JuniorEmployee("Alexandra", false, 1));
		employeeJuniorList.add(new JuniorEmployee("Jenny", false, 1));
		employeeJuniorList.add(new JuniorEmployee("Dan", true, 1));
		employeeJuniorList.add(new JuniorEmployee("Jack", false, 3));

		employeeMap.put("Junior", employeeJuniorList);

		List<Employee> employeeSeniorList = new ArrayList<Employee>();

		employeeSeniorList.add(new SeniorEmployee("Ryan", false, 10));
		employeeSeniorList.add(new SeniorEmployee("Raul", false, 3));
		employeeSeniorList.add(new SeniorEmployee("Andrew", false, 7));
		employeeSeniorList.add(new SeniorEmployee("Alexander", true, 8));

		employeeMap.put("Senior", employeeSeniorList);

		List<Employee> employeeManagerList = new ArrayList<Employee>();

		employeeManagerList.add(new Manager("Paul", true, 4));
		employeeManagerList.add(new Manager("Daniel", false, 12));

		employeeMap.put("Manager", employeeManagerList);

		List<Employee> allEmployeesList = new ArrayList<Employee>();

		createNewListWithAllEmployees(employeeMap, allEmployeesList);

		List<Employee> employeesWithoutParking = getEmployeesWithoutParkSpace(allEmployeesList);
		for (Employee employee : employeesWithoutParking) {
			System.out.println(employee.getName() + " is a " + employee.toString()
					+ " and he's been working in this company for " + employee.getSeniority() + " year(s) !");
			System.out.println(employee.getName() + " has a park space : " + employee.getParkSpace());
			System.out.println("");
		}
	}

	/**
	 * This method iterates over employeeMap and gets all employees and puts
	 * them into a list
	 * 
	 * @param employeeMap
	 * @param allEmployeesList
	 */
	private static void createNewListWithAllEmployees(Map<String, List<Employee>> employeeMap,
			List<Employee> allEmployeesList) {
		for (Map.Entry<String, List<Employee>> allEmployees : employeeMap.entrySet()) {
			String kEmployee = allEmployees.getKey();
			List<Employee> list = employeeMap.get(kEmployee);
			allEmployeesList.addAll(list);

		}
	}

	/**
	 * This method is taking all employees without a park space and puts them
	 * sorted by seniority into a list and throws exception if list is empty.
	 * 
	 * @param Employees
	 * 
	 */
	public static List<Employee> getEmployeesWithoutParkSpace(List<Employee> Employees) {
		if (Employees.isEmpty()) {
			throw new IllegalArgumentException("This list is empty!! ");
		} else {
			List<Employee> EmployeesWithoutParkSpace = new ArrayList<>();
			for (Employee e : Employees) {
				if (e.getParkSpace() == false) {
					EmployeesWithoutParkSpace.add(e);
				}
			}
			Collections.sort(EmployeesWithoutParkSpace);
			return EmployeesWithoutParkSpace;

		}
	}
}
