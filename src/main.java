import java.util.Scanner;

public class main {
   
	public static void main(String[] arg){ 
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Please enter a sentence: ");
		String str = scnr.nextLine();
		String split[] = str.split(" ", 0); 
		for(String s:split) 
		System.out.println(s);
		} 
	}