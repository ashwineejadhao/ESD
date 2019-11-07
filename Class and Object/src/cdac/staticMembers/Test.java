package cdac.staticMembers;

public class Test {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		Employee e2 = new Employee(2, "Jane Doe", 12345.6f);
		Employee e3 = new Employee();

		System.out.println("Total Objects Created = " + Employee.count);

	}

}
