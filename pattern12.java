package practice;

import java.util.Scanner;

public class pattern12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		for(int i = 1 ; i <= n ; i++) {
			
			for(int j=1 ; j <= n-i ;j++) {
				System.out.print(" ");
			}
			int starting1 = i;
			
			for(int j = 1 ; j <= i ;j++) {
				System.out.print(starting1);
				starting1 ++;
			}
		
			int starting2 = 2*i-2;
			for (int j = 1 ; j <= i-1 ; j++) {
				System.out.print(starting2);
				starting2--;
			}
			System.out.println();
		}
	}

}
