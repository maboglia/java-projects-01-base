
public class Main {
	public static void main(String[] args) {
		
		Student riccardo = new Student();
		
		riccardo.name = "Riccardo";
		riccardo.surname = "Nobile";
		
		int age = 19;
		riccardo.age = age;
		
		riccardo.marks = new int[] {3, 2, 4, 1};
		
		System.out.println("Riccardo marks: " + riccardo.marks[2]);
		
		Student alessandro = new Student();
		
		alessandro.name = "Alessandro";
		alessandro.surname = "Modaffari";
		
		alessandro.age = age;
		
		alessandro.marks = new int[] {7, 2, 8, 7};
		
		int alessandroMarks = alessandro.average();
		System.out.println("Alessandro marks: " + alessandroMarks);
		
		Student simone = new Student("Simone", "Cragnolini");
		System.out.println("Simone surname: " + simone.surname);
		
		Statistics stat = new Statistics();
		Student[] students = new Student[] {riccardo, alessandro};
		int avgStudenti = stat.average(students);
		System.out.println("Average students: " + avgStudenti);
		
		int avgStudenti2 = Statistics.averageS(students);
		System.out.println("Average students: " + avgStudenti2);
		
		Statistics statPol = new Statistics();
		statPol.minAverage = 6;
		int avgStudenti3 = statPol.average(students);
		System.out.println("Average (Poli) students: " + avgStudenti3);
		
		StatisticsStatic.minAverage = 6;
		int avgStudenti4 = StatisticsStatic.averageS(students);
		System.out.println("Average (Poli) students: " + avgStudenti4);
		
		Statistics stat1 = new Statistics();
		stat1.minAverage = 6;
		Statistics stat2 = new Statistics();
		stat2.minAverage = 5;
		
		StatisticsStatic.minAverage = 6;
		
		StatisticsStatic.minAverage = 5;
		
		System.out.println("Average (Poli) students: "
				+ stat1.average(students));
		System.out.println("Average (Poli) students: "
				+ stat2.average(students));
		System.out.println("Average (Poli) students: "
				+ StatisticsStatic.averageS(students));
		System.out.println("Istances: " + Student.istances);
	}
}
