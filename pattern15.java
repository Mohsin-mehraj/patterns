package practice;

import java.util.Scanner;

public class pattern15 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1 ; j <= i-1 ;j++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=n ;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
