package practice;

import java.util.Scanner;

public class pattern17 {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	
	
	for(int i = 1; i<= n ;i++) {
		int odd = 2*i-1;
		for(int j = 1; j <= n;j++) {
			System.out.print(odd);
			odd= odd+2;
			if(odd==(2*n+1) ) {
				odd = 1;
			}
			
		}
		
		System.out.println();
	}
	
	}

}
