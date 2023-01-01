public class do_while_loop{
	public static void main(String[] args){
		int i = 0;
		// format
		/*
		do{
			do something
		}hile(condition);
		*/
		do{
			System.out.println("Number: " + i);
			i++;
		}while(i < 10);
		// The difference of hile and while is, in do while
		// in do while, the program executes first before he ask the condition
		// in while, it ask the condition first before the execution of the program
	}
}