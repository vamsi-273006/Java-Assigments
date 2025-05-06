//performing control flow statements
//Source code

package assiignment11_Controlflow;

public class Control {
	public static void main(String[] args) {
		arguments.evenOdd();
		arguments.positive();
		arguments.voting(19);
		arguments.greater(10, 20);
		arguments.divisible();
	}
}

class  arguments {
	public static void evenOdd() {
		int a=10;
		if(a%2==0) {
			System.out.println(a+" is even number");
		}
		else {
			System.out.println(a+" is odd number");
		}
	}
	public static void positive() {
		int b=20;
		if(b>0) {
			System.out.println(b+" is positive number");
		}
		else{
			System.out.println(b+" is negative number");
		}
	}
	public static void voting(int age) {
		if(age>18) {
			System.out.println("Eligible for voting");
		}
		else {
			System.out.println("Not eligible for voting");
		}
	}
	public static void greater(int a,int b) {
		if(a>b) {
			System.out.println(a+" is larger than "+b);
		}
		else {
			System.out.println(b+" is larger than "+a);
		}
	}
	public static void divisible() {
		int num=20;
		if(num%5==0) {
			System.out.println(num+" is divisible by 5");
		}
		else if(num%11==0) {
			System.out.println(num+" is divisible by 11");
		}
		else {
			System.out.println(num+" is not divisible by 5 and 11");
		}
	}
}

//Output

10 is even number
20 is positive number
Eligible for voting
20 is larger than 10
20 is divisible by 5