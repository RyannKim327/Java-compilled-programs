package File Handling;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class Read {
	public static void main(String[] args){
		try{
			Scanner sc = new Scanner(new FileInputStream(new File("sample.txt")));
			while(sc.hasNext()){
				System.out.println(sc.nextLine());
			}
		}catch(Exception e){
			System.out.println("Hindi ko makita ang halaga nya.");
		}
	}
}