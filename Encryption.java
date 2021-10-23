import java.util.Random;
import java.util.Scanner;
public class Encryption {
	public static void main(String[] args){
		System.out.print("Enter text: ");
		String a = new Scanner(System.in).nextLine();
		System.out.println(encrypt(a));
		System.out.print("Enter encrypt: ");
		String b = new Scanner(System.in).nextLine();
		System.out.println(decrypt(b));
	}
	static String decrypt(String str){
		String[] a = str.split(", ");
		String b = "";
		int c = 0;
		for(String d : a){
			b += split(d, c);
			c++;
		}
		return b;
	}
	static String encrypt(String str){
		String a = "";
		for(int b = 0; b < str.length(); b++){
			int c = new Random().nextInt(8) + 1;
			if(Character.isUpperCase(str.charAt(b))){
				if((b % 2) == 0){
					a += c + "1" + ((char)(rotate(Character.toLowerCase(str.charAt(b)), c) - c)) + ", ";
				}else{
					a += c + "1" + ((char)(rotate(Character.toLowerCase(str.charAt(b)), c) + c)) + ", ";
				}
			}else{
				if((b % 2) == 0){
					a += c + "0" + ((char)(rotate(Character.toLowerCase(str.charAt(b)), c) - c)) + ", ";
				}else{
					a += c + "0" + ((char)(rotate(Character.toLowerCase(str.charAt(b)), c) + c)) + ", ";
				}
			}
		}
		return a.toLowerCase();
	}
	static String split(String str, int i){
		int a = Integer.parseInt(String.valueOf(str.charAt(0)));
		int b = Integer.parseInt(String.valueOf(str.charAt(1)));
		char c = str.charAt(2);
		String d = "";
		if(b == 1){
			if((i % 2) == 0){
				d += String.valueOf((char)(rotate(c, a) + a)).toUpperCase();
			}else{
				d += String.valueOf((char)(rotate(c, a) - a)).toUpperCase();
			}
		}else{
			if((i % 2) == 0){
				d += String.valueOf((char)(rotate(c, a) + a));
			}else{
				d += String.valueOf((char)(rotate(c, a) - a));
			}
		}
		return d;
	}
	static char rotate(char c, int i){
		char a;
		if(c >= 97 && c <= 122){
			if(((int)(c + i)) > 122){
				a = ((char)((c - i) + (26 - i)));
			}else if(((int)(c - i)) < 97){
				a = ((char)((c + i) - (26 + i)));
			}else{
				a = ((char)c);
			}
		}else{
			a = ((char)c);
		}
		return a;
	}
}
