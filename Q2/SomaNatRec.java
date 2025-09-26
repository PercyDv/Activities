package Q2;

import java.util.Scanner;

public class SomaNatRec {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		
		System.out.println(somaNat(n));
		
		kb.close();
	}
	public static int somaNat(int n) {
		if (n == 1) {
			return 1;
		}
		return n + somaNat(n-1);
	}

}
