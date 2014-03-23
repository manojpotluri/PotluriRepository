package CompositeDesignPattern;

public class CompositePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee CEO = new Employee("Potluri", "CEO", 3000);
		Employee headSales = new Employee("saleshead", "CEO", 3000);
		Employee headmarketing = new Employee("Marketing head", "CEO", 3000);
		Employee Clerk1 = new Employee("Clerk1", "CEO", 3000);
		Employee Clerk2 = new Employee("Clerk2", "CEO", 3000);
		Employee Manager1 = new Employee("Manager1", "CEO", 3000);
		Employee Manager2 = new Employee("Manager2", "CEO", 3000);
		
		CEO.add(Manager2);
		CEO.add(Manager1);
		CEO.add(headSales);
		CEO.add(headmarketing);
		
		for (Employee e:CEO.getSubordinates()) {
			System.out.println(e);
		}
	}

}
