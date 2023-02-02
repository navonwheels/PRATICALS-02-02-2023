class Employee 
{
	long employeeId;
	String employeeName;
	String Address;
	long employeePhone;
	double basicSalary;
	double specialAllowance = 250.80;
	double Hra = 1000.50;

	Employee(long Id, String Name, double salary, String address, long phone) 
{
		this.employeeId = Id;
		this.employeeName = Name;
		this.basicSalary = salary;
		this.Address = address;
		this.employeePhone = phone;
	}

	void calculateSalary() 
{
		double salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * Hra / 100);

		System.out.println("Salary of employee with ID " + employeeId + " is: " + salary);
	}

	void calculateTransportAllowance() 
{
		double transportAllowance = basicSalary*10/100;
		System.out.println("travel allowance =" + transportAllowance);
	}

}

class Manager extends Employee 
{
	Manager(long Id, String Name, double salary, String address, long phone) 
{
		super(Id, Name, salary, address, phone);
	}

	void calculateSalary() 
{
		double salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * Hra / 100);

		System.out.println("Salary of employee with ID " + employeeId + " is: " + salary);
	}

	void calculateTransportAllowance() 
{
		double transportAllowance = basicSalary*15/100;
		System.out.println("travel Allowance = " + transportAllowance);
	}
}

class Trainee extends Manager 
{
	Trainee(long Id, String Name, double salary, String address, long phone) {
		super(Id, Name, salary, address, phone);
	}

	void calculateSalary() 
{
		double salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * Hra / 100);

		System.out.println("Salary of employee with ID " + employeeId + " is: " + salary);
	}
	void calculateTransportAllowance() 
{
		double transportAllowance = basicSalary*10/100;
		System.out.println("travel allowance = " + transportAllowance);
	}

}

public class InheritanceActivity 
{
	public static void main(String args[]) 
{
		Manager manager = new Manager(126534, "peter", 65000, "chennai india", 237844);
		manager.calculateSalary();
		manager.calculateTransportAllowance();

		Trainee trainee = new Trainee(29846, "Jack", 45000, "Mumbai India", 442085);
		trainee.calculateSalary();
		trainee.calculateTransportAllowance();

	}
}