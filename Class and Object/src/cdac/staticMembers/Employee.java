package cdac.staticMembers;

public class Employee {

	int id;
	String name;
	float salary;
	static int count;

	Employee() {
		count++;
	}

	Employee(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		count++;
	}

	void print() {
		
		System.out.println("Id=" + id);
		System.out.println("Name=" + name);
		System.out.println("Salary=" + salary);
	}
}