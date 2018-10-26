package Examples;

public class EmpTest {
	public static void main(String[] args) {
		Employee emp = new Employee();
        emp.firstName = "Jason";
        emp.lastName = "Miskuf";
        emp.salary = 25.5;
        emp.iden = 2;
        
        emp.showEmp();
	}
}
