import java.util.Scanner;
public class flames {
	public static void main(String[] args){
		String[] flames = {"f", "l", "a", "m", "e", "s"};
		int[] f = new int[flames.length], f1 = new int[f.length - 1], f2 = new int[f1.length - 1], f3 = new int[f2.length - 1], f4 = new int[f3.length - 1], f5 = new int[f4.length - 1];
		System.out.print("Enter your crush name: ");
		String kras = new Scanner(System.in).nextLine();
		System.out.print("Enter your name: ");
		String myName = new Scanner(System.in).nextLine();
		String output;
		for(int i = 0; i < f.length; i++){
 			f[i] = flames(kras + myName, flames[i]);
		}
		for(int i = 0; i < f.length; i++){
			System.out.println("Sample output " + flames[i] + ": " + f[i]);
		}
		for(int i = 0; i < f1.length; i++){
			f1[i] = f[i] + f[i + 1];
		}
		for(int i = 0; i < f2.length; i++){
			f2[i] = f1[i] + f1[i + 1];
		}
		for(int i = 0; i < f3.length; i++){
			f3[i] = f2[i] + f2[i + 1];
		}
		for(int i = 0; i < f4.length; i++){
			f4[i] = f3[i] + f3[i + 1];
		}
		for(int i = 0; i < f5.length; i++){
			f5[i] = f4[i] + f4[i + 1];
		}
		System.out.println("Total: " + (f5[0] / (kras.length() + myName.length())));
		switch(f5[0] / (kras.length() + myName.length())){
			case 1:
				output = "Friends\n- Duda";
			break;
			case 2:
				output = "Love";
			break;
			case 3:
				output = "Angry\n- Kung saan nagsimula ang live story ng lolo at lola ko.";
			break;
			case 4:
				output = "Married";
			break;
			case 5:
				output = "Engage";
			break;
			case 6:
				output = "Sweet/Sibling\n- Pero may gusto din";
			break;
			default:
				output = "Baka wala na talagang poreber";
		}
		System.out.println(kras + " and " + myName + " are " + output);
	}
	public static int flames(String p1, String p2){
		p1 = p1.toLowerCase();
		p2 = p2.toLowerCase();
		return (p1.split(p2).length - 1);
	}
}
