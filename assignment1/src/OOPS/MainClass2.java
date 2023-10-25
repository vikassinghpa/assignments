package OOPS;

public class MainClass2 {

		public static void main(String[] args) {
			Student s1=new Student();
			s1.printInfo(20);
			s1.printInfo("vikas");
			s1.printInfo("vikas", 25);
		}

	}
	 class Student {
		String name;
		int age;
		
		public void printInfo(String name) {
			System.out.println(name);
		}
		public void printInfo(int age) {
			System.out.println(age);
		}
		public void printInfo(String name, int age) {
			System.out.println(name +" "+age);
		}
		
		
	}	

	
