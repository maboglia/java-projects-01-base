
public class Statistics {
	int average(Student[] students) {
		float tot = 0;
		for(Student s: students) {
			tot += s.average();
		}
		return Math.round(tot / students.length);
	}
}
