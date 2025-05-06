package assigments;

public class Assigmnet4 {
	//printing person details using static
	//Souce code
	static String name="Vamsi";
	static int  age=20;
	static String gender="Male";
	static String designation="Student";
	static double gpa=7.82;
	public static void main(String[] args) {
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(designation);
		System.out.println(gpa);
		
	}
	}


	//Output

	vamsi
	20
	Male
	Student
	7.82

	//Accessing static variable using class name
	//Source Code

	package staticaccess;
	public class Student {
		static String name="vamsi";
		static int  age=20;
		static String gender="Male";
		static String designation="Student";
		static double gpa=7.82;
		static int rollnum=543;
		public static void main(String[] args) {
			System.out.println(Student.name);
			System.out.println(Student.age);
			System.out.println(Student.gender);
			System.out.println(Student.designation);
			System.out.println(Student.gpa);
			System.out.println(Student.rollnum);
		}
	}

	//Output

	vamsi
	20
	Male
	Student
	7.82
	543

}
