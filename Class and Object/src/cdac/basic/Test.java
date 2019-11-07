package cdac.basic;

public class Test {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.id = 1;
		e1.name = "John Doe";
		e1.salary = 12345.6f;
		
		e1.print();
		
		Employee e2 = new Employee(2,"Jane Doe",12345.6f);
		e2.print();
	}
	
}
