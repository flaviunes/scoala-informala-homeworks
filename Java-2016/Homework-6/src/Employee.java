/**
 * This is the model class for all type of employees.
 * 
 * @author Flaviu
 *
 */
public abstract class Employee implements Comparable<Employee> {
	private String name;
	private boolean parkSpace;
	private int seniority;

	public Employee(String name, boolean parkSpace, int seniority) {
		this.name = name;
		this.parkSpace = parkSpace;
		this.seniority = seniority;
	}

	public boolean getParkSpace() {
		return parkSpace;

	}

	public String getName() {
		return name;
	}

	public int getSeniority() {
		return seniority;

	}

	@Override
	public int compareTo(Employee o) {
		if (this.seniority == o.seniority) {
			return 0;
		} else if (this.seniority > o.seniority) {
			return 1;
		}
		return -1;

	}

}
