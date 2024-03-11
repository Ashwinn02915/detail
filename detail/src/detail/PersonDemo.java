//to demonstrate person detail entity class
package detail;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		Person p1 = new Person();
		
		Scanner sc = new Scanner(System.in);
		String name,city;
		int age;
		System.out.println("Enter Person Details: Name,Age,City");
		name = sc.nextLine();
		age = sc.nextInt();
		sc.nextLine();
		city= sc.nextLine();
		
		p1.setPersonName(name);
		p1.setPersonAge(age);
		p1.setCity(city);
		System.out.println("Person Details Name: "+p1.getPersonName()+"\tAge: "+p1.getPersonAge()+"\tCity: "+p1.getCity());
		
		System.out.println("Enter Person Details : Name , age and city");
		name = sc.nextLine();
		age = sc.nextInt();
		sc.nextLine();
		city= sc.nextLine();
		p1 = new Person(name,age,city);
		System.out.println("Person Details Name: "+p1.getPersonName()+"\tAge: "+p1.getPersonAge()+"\tCity: "+p1.getCity());
		sc.close();
	}

}
