package practice;

import java.util.Scanner;

public class pattern4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int starting =1;
		for (int i = 1 ; i <=n ;i++) {
			for(int j = 1 ; j <=i ;j++) {
				System.out.print(starting);
				starting++;
			}
			System.out.println();
		}
	}

}
