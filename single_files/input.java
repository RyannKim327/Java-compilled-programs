// import Scanner
import java.util.Scanner;

public class input{
	publilc static void main(String[] args){
		// Initiate a variable for input
		// System.in means user input or System will get a data from user
		Scanner sc = new Scanner(System.in);

		// Prompt
		System.out.print("What us your name: ");
		String name = sc.nextLine();
		System.out.printf("Hello %s\n", name);

		// .nextLine() -> For a whole line
		// .next() -> for just a word or cut by whitespaces
		// .nextInt() -> for integers or int variable
		// .nextFloat -> for floats
	}
}