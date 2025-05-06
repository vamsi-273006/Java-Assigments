//problem solving on for loop
//Source code
package assignment13_problemsonLoops;

public class ForProblems {
public static void main(String[] args) {
	Operations.square();
	Operations.alphabets();
	Operations.factors(20);
}
}
class Operations{
	public static void square() {
		for(int i=1;i<=10;i++) {
			System.out.print(i*i+"  ");
		}
		System.out.println();
	}
	public static void alphabets() {
		for(char i='A';i<='Z';i++) {
			System.out.print(i+"  ");
			
		}
		System.out.println();
	}
	public static void factors(int a) {
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				System.out.print(i +" ");
			}
		}
	}
}

//Output

1  4  9  16  25  36  49  64  81  100  
A  B  C  D  E  F  G  H  I  J  K  L  M  N  O  P  Q  R  S  T  U  V  W  X  Y  Z  
1 2 4 5 10 20 