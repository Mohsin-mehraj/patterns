package practice;

import java.util.Scanner;

public class pattern11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i = 1; i <= n ;i++) {
			for(int j  = 1 ; j <= n-i ;j++) {
				System.out.print(" ");
			}
			
			int starting = 1;
			for(int j = 1 ; j <=i ;j++) {
				System.out.print(starting);
				starting ++;
			}
			
			System.out.println();
		}

	}

}
