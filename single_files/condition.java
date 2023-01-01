public class condition{
	public static void main(String[] args){
		int num1 = 5;
		int num2 = 10;
		if(num1 > num2){
			// printf or print fotmatting is used to lessen the appending of datatypes
			// %s -> String
			// %d -> Numbers
			System.out.printf("%d is greater than %d", num1, num2);
		}else{
			System.out.printf("%d is less than %d", num1, num2);
		}
		// TO have a break line
		System.out.println();
		
		// This is to use with else if
		if(num1 > num2){
			// printf or print fotmatting is used to lessen the appending of datatypes
			// %s -> String
			// %d -> Numbers
			System.out.printf("%d is greater than %d", num1, num2);
		}else if(num1 == 2){
			System.out.printf("%d and %d are equal", num1, num2);
		}else{
			System.out.printf("%d is less than %d", num1, num2);
		}
		System.out.println();
	}
}