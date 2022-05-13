
public class Statistics {
	
	int minAverage;
	
	// Method
	int average(Student[] students) {
		float tot = 0;
		for(Student s: students) {
			tot += s.average();
		}
		int avg = Math.round(tot / students.length);
		avg = Math.max(minAverage, avg);
		return avg;
	}
	
	// Static method o Class method
	static int averageS(Student[] students) {
		float tot = 0;
		for(Student s: students) {
			tot += s.average();
		}
		return Math.round(tot / students.length);
	}
}
