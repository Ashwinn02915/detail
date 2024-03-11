//to define entity class for getting person details..
package detail;

public class Person {
	 private String personName;
	 private int personAge;
	 private String city;
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	//using default constructor
	public Person() {
		System.out.println("Default Constructor");
	}
	//using parameterized cons.
	public Person(String personName, int personAge, String city) {
		System.out.println("parameterized constructor");
		this.personName = personName;
		this.personAge = personAge;
		this.city = city;
	}
	
	 
	
}
