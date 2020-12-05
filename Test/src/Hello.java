

public class Hello {

	public static void main(String[] args) {
		
		// Variables
		String myName = "Tyler";
		int myNumber = 5;
		float myDecimal = 15.5f;
		double myDouble = 19.99d;
		int myInt = (int) myDouble;
		char chSingle = 's';
		boolean myBool = false;
		byte n = 100;
		byte c = 'C'; // ASC Table Decimal 67
		short shortNumber = 5000;
		long longNumber = 15000000L;
		float powerFloatNumber = 35e3f;
		double powerDoubleNumber = 12E4d;
		
		//Print Variables
		System.out.println(myName);
		System.out.println(myNumber);
		System.out.println(myDecimal);
		System.out.println(myDouble);
		System.out.println(myInt);
		System.out.println(chSingle);
		System.out.println(myBool);
		System.out.println(n * c);
		System.out.println(myName + myNumber);
		System.out.println(shortNumber);
		System.out.println(longNumber);
		System.out.println(powerFloatNumber);
		System.out.println(powerDoubleNumber);
		
		//Operators
		System.out.println(20 / 10);
		System.out.println(20 * 10);
		
		int x = 10;
		int y = 5;
		int z = 2;
		int push = x >> 4;
		
		System.out.println(x * y * z / z - z + x * 50); 
		System.out.println(push); 
		
		if(x > 9 || x == 10 && y == 5) {
			System.out.println("yes");
		} else {
			
			System.out.println(myBool);
		}
		
		//Java Strings
		
		String stringLength = "aabbccddeeff"; // 12 letters
		System.out.println(stringLength.length());
		
		if (stringLength.length() <= 12) {
			System.out.println(
					stringLength.toUpperCase() + " " + 
					stringLength.toLowerCase() + " " + 
					stringLength.indexOf(stringLength + 2) + " " +
					"Practicing with \"stringLength\"" + " " +
					"Practicing with \'stringLength\'" + " " +
					"Practicing with \\ stringLength"
					); 
		} else {
			System.out.println(false);
			
		}
		
		
	}
	
}