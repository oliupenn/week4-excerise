
public class Person {
	int age;
	String name;
	
	public Person(String n, int a) {
		name = n;
		age = a;
	}
	
	
	public static void main(String[] args) {
		Person p = new Person("Bob", 30);
		System.out.println(p.name);

	}

}
