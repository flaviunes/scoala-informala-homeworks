/**
 * This is a subclass for Employee
 * 
 * 
 */
public class Manager extends Employee {

	public Manager(String name, boolean parkSpace, int seniority) {
		super(name, parkSpace, seniority);

	}

	@Override
	public String toString() {
		return " Manager ";
	}

}
