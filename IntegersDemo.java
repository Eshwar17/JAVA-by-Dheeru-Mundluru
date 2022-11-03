
public class IntegersDemo {
/*
 * Integers :
 * ------------
 * Whole/fixed point numbers
 * 4 types -> byte, short, int, long
 * BYTE - 8 bits - -2^7 to 2^7-1 - default = 0
 * SHORT - 16 bits - -2^15 to 2^15-1 - 0
 * INT - 32 bits - -2^31 to 2^31-1 - 0
 * LONG - 64 bits - -2^63 to 2^63-1 - 0
 * 
 * BASE 2 IS USED TO REPRESENT THE VALUE RANGE AS COMPUTERS USE BINARY NUMBER SYSTEM
 * 
 * MSB IS THE LEFTMOST BIT IN THE 8 BITS AND IT IS USED TO REPRESENT THE SIGN OF THE GIVEN INTEGER.
 * 
 * Internal Representation :
 * Java uses SIGNED TWO'S COMPLIMENT SCHEME to store the integers internally(Computers also use the same)
 * 
 * In Java, we only have 2 types of literals for Integers -> int, long literals, no byte, short literals.
 * 
 * Errors we face during the assignment : 1. Possible lossy conversion from long to int/ int to byte..
 * 										  2. Number too large error(literal error) -> To resolve simply we add L at the end.
 * 
 * Other Integer literal formats -> 1. Hexadecimal - 0x8000_0000, 2. Binary -> 0b0100_0001, 3. Octal - 0101
 * 
 * All the above literal formats are used rarely for bitwise operations
 * 
 */
	
	int id = 1000;
	byte age = 18;
	short rank = 165;
	long phone = 2_23_45_67_890L;
	void compute() {
		int nextId = id + 1;
		System.out.println("Id : " + nextId);
		System.out.println("Age : " + age);
		System.out.println("Rank : " + rank);
		System.out.println("Phone : " + phone);
	}
	static void primitives() {
		System.out.println("Inside primitives method : ");
		int intHex = 0x0041; //decimal = 65
		System.out.println("Hexadecimal representation : " + intHex);
		
	}
	public static void main(String[] args) {
		IntegersDemo i = new IntegersDemo();
		i.compute();

	}

}
