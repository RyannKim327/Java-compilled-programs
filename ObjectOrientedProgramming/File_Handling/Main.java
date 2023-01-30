package File_Handling;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		String file_path = "C:/Users/PC/Desktop/java/Java-compilled-programs/";
		try{
			Scanner sc = new Scanner(new FileInputStream(new File(file_path + "ObjectOrientedProgramming/File_Handling/sample.txt")));
			while(sc.hasNext()){
				System.out.println(sc.nextLine());
			}
		}catch(Exception e){
			System.out.println("Hindi ko makita ang halaga nya.");
		}
	}
}