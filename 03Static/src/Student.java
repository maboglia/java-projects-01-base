
public class Student {
	
	// Fields
	String name;
	String surname;
	int age;
	int[] marks;
	static int istances = 0;
	
	// Constructor
	Student(String name, String surname) {
		this.name = name;
		this.surname = surname;
		count();
	}
	
	// Default constructor
	Student() {
		this(null, null);
	}
	
	
	static int count() {
		istances += 1;
		return istances;
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
