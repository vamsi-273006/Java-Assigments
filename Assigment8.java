//Nom static variables

//Source Code
package Assignment8_nonstaticmethods;
public class Employee {
public static void main(String[] args) {
	Details de1= new Details();
	de1.displayEmployeeDetails(101, "Teja", 15000);
	de1.calculateAnnualSalary(15000);
}
}
class Details {
	int employee_id;
	String name;
	double salary;
	public void calculateAnnualSalary(double salary){
		System.out.println("auual salary="+salary*12);
		}
	public void displayEmployeeDetails(int employee_id,String name,double salary) {
		System.out.print("Employee_id:"+employee_id);
		System.out.print("  Employee Name:"+name);
		System.out.print("  Employee salary:"+salary);
		System.out.println();
	}
}



//output
Employee_id:101  Employee Name:Teja  Employee salary:15000.0
auual salary=180000.0