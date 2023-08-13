package practice;

import java.util.Scanner;

public class pattern7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i = 1; i <= n ;i++) {
			char starting = ((char)('A' + i -1));
			for (int j = 1; j <=i ;j++) {
				System.out.print(starting);
			}
			System.out.println();
			
		}
		

	}

}
