import java.util.Scanner;
public class SwapWidhout3rdVAr {
	public static void main(String args[]){
		int a,b;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first no. -");
		a = in.nextInt();
		System.out.println("Enter the second no. -");
		b = in.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("The swapped number is = " + a + b);
	}
}
