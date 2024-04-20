package task2;

public class Employee extends Person {

	int empId;
	double salary;
	
	public Employee(String name, int age, int empId, double salary) {
		super(name, age);
		this.empId = empId;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", salary=" + salary + ", name=" + name + ", Age=" + Age + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee("john",30,323,200000);
		System.out.println(emp);
		
	}

}
