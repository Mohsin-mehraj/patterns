package practice;

import java.util.Scanner;

public class pattern14 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i = 1; i <= n+1 ;i++) {
			for(int j = 1 ; j <= i ;j++) {
				if(j==1) {
					System.out.print("*");
				}else {
					System.out.print(j-1);
				}

			}
			for(int j= i-1; j>=1;j--) {
				if(j == 1) {
					System.out.print("*");
				}else {
					System.out.print(j-1);
				}
			}
			System.out.println();
		}
		
		for (int i = 1; i<=n ;i++) {
			for(int j = 1; j <= n-i +1;j++) {
				if(j ==1) {
					System.out.print("*");
				}else {
					System.out.print(j-1);
				}
				
			}
			
			for (int j = n-i; j >= 1;j--) {
				if(j == 1) {
					System.out.print("*");
				}else {
					System.out.print(j-1);
				}
			}
			System.out.println();
			
				
		}
		
		
}

}
