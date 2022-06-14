
public class StatisticsStatic {
	
	static int minAverage;
	
	static int averageS(Student[] students) {
		float tot = 0;
		for(Student s: students) {
			tot += s.average();
		}
		int avg = Math.round(tot / students.length);
		avg = Math.max(minAverage, avg);
		return avg;
	}
}
