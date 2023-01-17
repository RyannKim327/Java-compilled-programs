package Simple_Student_Identification;
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		System.out.println("Welcome to my Simple Console Based program of Student Identification");
		System.out.print("Enter Student ID: ");
		String sid = new Scanner(System.in).nextLine();
		int id = -1;
		for(int i = 0; i < data.ID.length; i++){
			if(sid.equals(data.ID[i])){
				id = i;
				break;
			}
		}
		if(id >= 0){
			System.out.println("Student information");
			System.out.printf("Student name:\t\t\t%s\n", data.name[id]);
			System.out.printf("Student birthyear:\t\t%d\n", data.birthyear[id]);
			System.out.printf("Student gender:\t\t\t%s\n", data.gender[id]);
			System.out.printf("Student elementary school:\t%s\n", data.elementary[id]);
			System.out.printf("Student highschool:\t\t%s\n", data.highschool[id]);
			System.out.printf("Student senior highschool:\t%s\n", data.senior_highschool[id]);
			System.out.printf("Student college:\t\t%s\n", data.college[id]);
		}else{
			System.out.println("There is no student found here.");
		}
	}
}