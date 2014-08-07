import java.util.Arrays;
import java.util.Scanner;
public class StringRephrase {
	
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Text Rearranging");
		System.out.println("Enter Your Sentance");
		String strIn = keyboard.nextLine();
		String[] explode = strIn.split("\\s+");
		String strOut = new String();
		for (int i = 1;i<explode.length;i++)
		{
			strOut += explode[i] + " ";
		}
			strOut += explode[0].toLowerCase();
			strOut = strOut.substring(0,1).toUpperCase() + strOut.substring(1);
		System.out.println("I have rephrased that line to read:");
		System.out.println(strOut);
		
		
		
	
			
			
	
	}

}

