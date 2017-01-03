/**
 * This is a subclass for employee
 * 
 * 
 */
public class SeniorEmployee extends Employee {

	public SeniorEmployee(String name, boolean parkSpace, int seniority) {
		super(name, parkSpace, seniority);

	}

	@Override
	public String toString() {
		return " SeniorEmployee ";
	}

}
