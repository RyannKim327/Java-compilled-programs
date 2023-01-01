public class conditionv2{
	public static void main(String[] args){
		// This is how to use switch case break statement
		// Basically this only use for equal value
		int num1 = 5;
		switch(num1){
			case 1:
				// if num1 == 2
				System.out.println("Sunday");
			break;
			case 2:
				// else if num1 == 2
				System.out.println("Monday");
			break;
			case 3:
				// else if num1 == 3
				System.out.println("Tueday");
			break;
			case 4:
				// else if num1 == 4
				System.out.println("Wednesday");
			break;
			case 5:
				// else if num1 == 5
				System.out.println("THursday");
			break;
			case 6:
				// else if num1 == 6
				System.out.println("Friday");
			break;
			case 7:
				// else if num1 == 7
				System.out.println("Satday");
			break;
			default:
				// else
				System.out.println("Undefined day of week");
			break;
		}
	}
}