package jPack;

public class W3SchJava {
	public static void main(String[] args) {
	System.out.println("Hello!");
	System.out.println(333);
	System.out.println(3 + 3);
	System.out.println(3 - 3);
	System.out.println(3 * 3);
	System.out.println(3 / 3);
	// comment
	/* line starts here
	 cannot read by java */
	String x = "abc";
	System.out.println(x);
	int y;
	y = 12;
	System.out.println(y);
	float z = 1.5f;
	z = 1.2f;
	System.out.println(z);
	final char m = 'N';
	//char m = 'O';
	System.out.println(m);
	System.out.println("def " + x);
	String v = x + y;
	System.out.println(v);
	System.out.println(y + z);
	int q = 3, r = 4;
	System.out.println(q + r);
	int s;
	r = s = 4;
	System.out.println(s + r);
	byte bit1= 127;
	System.out.println(bit1);
	short bit2 = 32767;
	System.out.println(bit2);
	// int on 4 bit
	long bit8 = 900000001;
	System.out.println(bit8);
	// float bit 4 fraction
	double bitf8 = 1.2345678987654012d;
	System.out.println(bitf8);
	// boolean on true or false 1 bit
	// char on single character 2 bits
	char ascii = 126;
	System.out.println(ascii);
	
	}
}
