package practice;

import java.util.Scanner;

public class pattern13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		 int mid = (n+1)/2;
		
		for(int i = 1; i <= mid ;i++ ) {
			
			for(int j = 1; j <= mid - i ;j++) {
				System.out.print(" ");
			}
			for(int j = 1 ;j <= 2*i-1 ;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		for(int i = 1 ;i<=mid-1 ;i++) {
			for(int j = 1; j <= i ;j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <=2 * (mid-i) -1  ;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
	

	}

}
