package basics;
class Employee{
	int empId;
	String name;
	String Address;
}

interface EmpImp{
	void addNewEmployee(int id,String name,String Address);
	void updateEmployee(int id,String name,String Address);
	void deleteEmployee(int id);
	Employee[] allEmployees();
}

class FileIO implements EmpImp{

	@Override
	public void addNewEmployee(int id, String name, String Address) {
		MyConsole.print("employee added from file");
		
	}

	@Override
	public void updateEmployee(int id, String name, String Address) {
		MyConsole.print("employee updated succesfully");
		
	}

	@Override
	public void deleteEmployee(int id) {
		MyConsole.print("employee deleted succesfully");
		
	}

	@Override
	public Employee[] allEmployees() {
		// TODO Auto-generated method stub
		return allEmployees();
	}
	
}

class MySqlImp implements EmpImp{

	@Override
	public void addNewEmployee(int id, String name, String Address) {
		MyConsole.print("employee addeed in mysql");
		
	}

	@Override
	public void updateEmployee(int id, String name, String Address) {
		MyConsole.print("employee updated in mysql");
		
	}

	@Override
	public void deleteEmployee(int id) {
		MyConsole.print("employee deleted from mysql");
		
	}

	@Override
	public Employee[] allEmployees() {
		
		return allEmployees();
	}
	
}

class Empfactory{
	public static EmpImp createOptions(String type){
		if(type=="FileIO") {
			return new FileIO();
		}
		else if(type=="MySqlImp") {
			return new MySqlImp();
		}
		return null;
	}
}
public class EmployeeApp {
     static EmpImp empobj = Empfactory.createOptions("MySqlImp");
	public static void main(String[] args) {
		empobj.addNewEmployee(123, "viresh", "Bangalore");
		empobj.updateEmployee(123, "biresh", "Bengaluru");
		empobj.deleteEmployee(123);

	}

}
