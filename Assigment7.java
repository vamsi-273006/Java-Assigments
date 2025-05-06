//method using
//Source code
package Assignment7_methods;
public class Area {
public static void main(String[] args) {
	System.out.println("area="+square(5));
	System.out.println("Simple Interest="+calculateInterest(100000,2,2));
	System.out.println("Fahren heat="+celsiusToFahrenheit(23.8));
	System.out.println("average is="+averageOfThreeNumbers(25.3,60,15.2));
}
public static int square(int side) {
	return side*side;
}
public static double calculateInterest(double p,double r,int t) {
	return (p*t*r)/100;
}
public static double celsiusToFahrenheit(double celcius) {
	return (celcius*9/5)+32;
	
}
public static double averageOfThreeNumbers(double a, double b, double c) {
	return (a+b+c)/3;
}
}
//Output

area=25
Simple Interest=4000.0
Fahren heat=74.84
average is=33.5