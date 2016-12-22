/**
 * This is a subclass for Employee.
 * 
 * 
 */
public class JuniorEmployee extends Employee {

	public JuniorEmployee(String name, boolean parkSpace, int seniority) {
		super(name, parkSpace, seniority);

	}

	@Override
	public String toString() {
		return " JuniorEmployee ";
	}

}
