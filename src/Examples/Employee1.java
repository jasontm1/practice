package Examples;

public class Employee1 {
	static float minWage = 15.0F;
	static int retAge = 65;
	private String firstName;
	private String lastName;
	private float salary;
	private int id; 
	
	public void showEmp() {
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Salary: " + salary);
		System.out.println("id: " + id);
		System.out.println("Minimum Wage: " + minWage);
		System.out.println("Retirement Age: " + retAge);
	}
	
	public String getFirstName() {
		return firstName;
	}	
    
	public void setFirstName(String f) { 
    	firstName = f;
    }
    
    public String getLastName() {
    	return lastName;
    }
	
	public void setLastName(String l) {
		lastName = l;
	}
	
	public float getSalary() {
		return salary;
	}
	
	public void setSalary(float s) {
		salary = s;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int i) {
		id = i;
	}
}

