package OOPS;

public class MainClass1 {

	public static void main(String[] args) {
		Student p1 = new Student();
		p1.name ="vikas";
		p1.age =26;
		p1.height =6;
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.height);
		p1.walk();
		p1.eat();
		p1.walk(2);
		
	
	}

}
class Student {
	String name;
	int age;
	int height;
	
	Student(){
		System.out.println("constructor called");
		
	}
	 
	public void walk() {
		System.out.println("vikas is walking");
	}
	public void eat() {
	System.out.println("vikas is eating");
	}
	public void walk(int steps) {
		System.out.println(name +" walked "+ steps +" steps");
	
	}
}
