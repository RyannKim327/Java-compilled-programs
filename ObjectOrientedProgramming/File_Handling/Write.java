package File_Handling;

import java.io.FileOutputStream;
import java.util.Scanner;

public class Write {
	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the text here: ");
			String text = sc.nextLine();
			FileOutputStream output = new FileOutputStream("sample.txt");
			output.write((text.getBytes()));
			output.flush();
		}catch(Exception e){
			System.out.println("Pre, nasan na kasi sya");
		}
	}
}
