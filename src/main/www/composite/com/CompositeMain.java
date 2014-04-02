package www.composite.com;

public class CompositeMain {

	public static void main(String[] args) {
		Employee emp1 = new Developer("JACK", 10000);
		Employee emp2 = new Developer("JAMMIE", 15000);
		Employee manager1 = new Manager("ROSE", 25000);
		manager1.add(emp1);
		manager1.add(emp2);
		Employee emp3 = new Developer("LESLIE", 20000);
		Manager generalManager = new Manager("ROY", 50000);
		generalManager.add(emp3);
		generalManager.add(manager1);
		generalManager.print();
	}
}
