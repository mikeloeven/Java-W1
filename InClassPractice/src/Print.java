import java.util.Scanner;
public class Print {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter First Number");
		double input1 = keyboard.nextDouble();
		System.out.println("Enter Second Number");
		double input2 = keyboard.nextDouble();
		double resultD = input1*input2;
		
		int resultI = (int)resultD; 
		
		System.out.println("The Double Answer Is: "+ resultD);
		System.out.println("The Integer Answer Is: "+ resultI);
		
		keyboard.close();
	}

}
