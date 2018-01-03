package subtraction;

import java.util.Scanner;

public class Sub {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		Add ad = new Add();
		ad.addition(a, b);
	}
	
}
