// Local Variables
//Source Code

package variables;
public class Variable {
public static void main(String[] args) {
	int a=10;
	float b=20.0f;
	double c=20.3;
	char d='T';
	long e=12345987l;
	short f=1478;
	byte g =1;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
	System.out.println(f);
	System.out.println(g);
}
}


//Output
10
20.0
20.3
T
12345987
1478
1

//Static variables
//Source Code

package variables;
public class Staticvariables {
	static int a=10;
	static float b=20.0f;
	static double c=20.3;
	static char d='T';
	static long e=12345987l;
	static short f=1478;
	static byte g =1;
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
	}
}

// Output
10
20.0
20.3
T
12345987
1478
1

//printing non static variables
//Source Code

package variables;
public class NonstaticVariables {
	int a=10;
	float b=20.0f;
	double c=20.3;
	char d='T';
	long e=12345987l;
	short f=1478;
	byte g =1;
	public static void main(String[] args) {
		NonstaticVariables non=new NonstaticVariables();
		System.out.println(non.a);
		System.out.println(non.b);
		System.out.println(non.c);
		System.out.println(non.d);
		System.out.println(non.e);
		System.out.println(non.f);
		System.out.println(non.g);
	}
}

//Output
10
20.0
20.3
T
12345987
1478
1