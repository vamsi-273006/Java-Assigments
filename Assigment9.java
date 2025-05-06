//non static methods
//Souce code

package Assignment9_nonstaticmethods;
public class Nonstatic {
public static void main(String[] args) {
	Nonstatic non=new Nonstatic();
	System.out.println(non.perimeter(10.5,5.2));
}
public double perimeter(double l,double b) {
	method();
	return 2*(l+b);
}
public void method() {
	System.out.print("Perimeter is:");
}
}

//Output

Perimeter is:31.4


//non static method calling
//Source Code
package Assignment9_nonstaticmethods;

public class StaticAndNonstatic {
public static void main(String[] args) {
	Nonstatic non=new Nonstatic();
	System.out.println(non.perimeter(10.5,5.2));
}
public double perimeter(double l,double b) {
	method();
	return 2*(l+b);
}
public static void method() {
	System.out.print("Perimeter is:");
}
}

//Output
Perimeter is:31.4