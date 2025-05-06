//Sum and average of a student marks
// Source Code

package assignment5;
public class SumAverage {
 int Telugu=80;
 int Hindi=60;
 int English=90;
 int Maths=91;
 int Science=85;
 int Social=93;
 int sum=Telugu+Hindi+English+Maths+Science+Social;
 int average=sum/6;
 public static void main(String[] args) {
	 SumAverage su=new SumAverage();
	System.out.println("sum="+su.sum);
	System.out.println("average="+su.average);
}
}

//output

sum=499
average=83

//Finding Simple Interest
//Source Code

package assignment5;
public class SimpleInterest {
int p=100000;
int t=2;
int r=2;
int i=p*t*r/100;
public static void main(String[] args) {
	SimpleInterest si=new SimpleInterest();
	System.out.println("simple interest="+si.i);
}
}

//Output

simple interest=4000

//Calculating area and perimeter of a square
//Souce Code

package assignment5;
public class AreaPerimeter {
double length=25.2;
double breadth=10.5;
double perimeter=2*(length+breadth);
double area=length*breadth;

public static void main(String[] args) {
	AreaPerimeter ar=new AreaPerimeter();
	System.out.println("perimeter="+ar.perimeter);
	System.out.println("area="+ar.area);
}
}

//Output
perimeter=71.4
area=264.59999999999997

//finding square and cube of a number
//Source Code

package assignment5;
import java.util.Scanner;
public class SquareCube {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	public static void main(String[] args) {
		SquareCube sq=new SquareCube();
		int square=sq.n*sq.n;
		int cube=sq.n*sq.n*sq.n;
		System.out.println("squre ="+square);
		System.out.println("cube="+cube);
	}
}

//Output

5
squre =25
cube=125

//Finding remainder and quotient of a numbers
//Source Code

package assignment5;
import java.util.Scanner;
public class Remainder {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Eneter first number:");
	int a=sc.nextInt();
	System.out.print("Enter second number:");
	int b=sc.nextInt();
	System.out.println("remainder="+ a%b);
	System.out.println("quotient="+ a/b);
}
}

//Output

Eneter first number:631
Enter second number:20
remainder=11
quotient=31