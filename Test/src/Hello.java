

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
		
		// Math
		
		
		System.out.println(Math.max(x,y));
		System.out.println(Math.min(x,y));
		System.out.println(Math.sqrt(y));
		System.out.println(Math.abs(-4.7));
		System.out.println(Math.random());
		int randomNum = (int)(Math.random() * 50); 
		System.out.println(randomNum);
		
		// Switch
		
		int day = 1 + 2; //outputs case 3
		switch (day) {
		case 1: 
			System.out.println("Monday");
			break;
		case 2: 
			System.out.println("Tuesday");
			break;
		case 3: 
			System.out.println("Wensday");
			break;
		case 4: 
			System.out.println("Thursday");
			break;
		case 5: 
			System.out.println("Friday");
			break;
		case 6: 
			System.out.println("Saturday");
			break;
		case 7: 
			System.out.println("Sunday");
			break;
		}
		
		// Switch no value
		
		int noValue = 0; //outputs default statement
		switch (noValue) {
		case 1: 
			System.out.println("Monday");
			break;
		case 2: 
			System.out.println("Tuesday");
			break;
		case 3: 
			System.out.println("Wensday");
			break;
		case 4: 
			System.out.println("Thursday");
			break;
		case 5: 
			System.out.println("Friday");
			break;
		case 6: 
			System.out.println("Saturday");
			break;
		case 7: 
			System.out.println("Sunday");
			break;
		default:
			System.out.println("I wish it was friday");
		}
		
		// While loop
		
		int i = 1;
		 while (i < 5) {
		 System.out.println(i);
		 i++;
		 }
		
		// Do While
		
		 int b = 0;
		 do {
		  System.out.println(b);
		  b++;
		 }
		 while (b < 5);
		 
		 // For Loop
		
		 for (int d = 0; d < 5; d = d + 2) {
			 System.out.println(d);
		 }
		 
		 // For-Each Loop
		 
		 String[] cars = {"Volvo", "BMW", "Subaru", "Chevrolet"};
		 for(String f : cars) {
			 System.out.println(f);
		 }
		 
		 // Break
		 
		 int k = 0;
		 while (k < 10) {
		   System.out.println(k);
		   k++;
		   if (k == 4) {
		     break;
		   }
		 }
		 
		 //Continue
		 int h = 0;
		 while (h < 10) {
		   if (h == 4) {
		     h++;
		     continue;
		   }
		   System.out.println(h);
		   h++;
		 }
		 
		 // Array Looping
		 
		 String[] food = {"Pizza", "Burger", "Milk", "Pasta"};
		 for (int fd = 0; fd < food.length; fd++) {
			 System.out.println(food[fd]);
		 }
		 
		 //More than one array
		 
		int[][] myNumb = { {1,2,3,4}, {5,6,7,8} };
		int xx = myNumb[1][1]; // first [] is the array second [] is the value
		System.out.println(xx);
	}
	
}