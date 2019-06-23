
public class Peron {
	int age;
	String name;
	
	public Peron(String n, int a) {
		name = n;
		age = a;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Peron p = new Peron("Bob", 30);
		p.name = "Robert";
		System.out.println(p.name);

	}

}
