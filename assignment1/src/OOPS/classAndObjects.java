package OOPS;
import java.util.*;
  class student{
	int age;
	String name;
public void details() {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the name :");
	name=s.nextLine();
	System.out.println("enter the age :");
	age=s.nextInt();
}
public void displayDetails() {
	System.out.println(name);
	System.out.println(age);
}
}
public class classAndObjects {
	

	public static void main(String[] args) {
		student s= new student();
		s.details();
		s.displayDetails();

	}

}
