class Employee {
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance = 250.80;
	double Hra = 1000.50;

	Employee(long Id, String Name, String address, long phone, double salary) {
		this.employeeId = Id;
		this.employeeName = Name;
		this.employeeAddress = address;
		this.employeePhone = phone;

	}

	public  void calculateSalary() {

		double salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * Hra / 100);
		
		 System.out.println("Salary of employee with ID " + employeeId + " is: " + salary);
		
	}

}

class Manager extends Employee {

	Manager(long Id, String Name, String address, long phone, double salary) {
		super(Id, Name, address, phone,salary);
		basicSalary = salary;
	    specialAllowance = 15;
		
		}
	
	
}
class Trainee extends Manager{
	
	Trainee(long Id, String Name, String address, long phone, double salary){
		super(Id,Name,address,phone,salary);
		basicSalary = salary;
	    specialAllowance = 10;
		
	}
	

}

public class InheritanceActivity {
	public static void main(String args[]) {
		Manager manager = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
	    manager.calculateSalary();

	    Trainee trainee = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
	    trainee.calculateSalary();
		

	}
}