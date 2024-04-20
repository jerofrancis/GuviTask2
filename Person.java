package task2;

public class Person {

	String name;
	int Age = 18;

	public Person(String name, int age) {
		this.name = name;
		Age = age;
	}

	public void display() {
		System.err.println("The name of the person is:" +name+ " and age is:"+Age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("abraham", 80);
		p.display();
	}
}
