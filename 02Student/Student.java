
public class Student {
	
	// Fields
	String name;
	String surname;
	int age;
	int[] marks;
	
	// Constructor
	Student(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	
	// Default constructor
	Student() {
		
	}
	
	// Methods
	
	int average() {
		float sum = 0;
		for(int x: marks) {
			sum += x;
		}
		float avg = sum / marks.length;
		return Math.round(avg);
	}
}
