/*
* Replit has an error on this spot, here I don't know the reason
* You may use * as universal or all files inside of that particular folder
* This way I use to to call an specific file
*/

public class main_file1{
	public static void main(String[] args){
		// Initiate file1 as variable
		e_file1 f = new e_file1("Hello");
		// get data
		System.out.println(f.getData());

		// change the default data
		f.setData("John Doe");
		System.out.println(f.getData());
	}
}