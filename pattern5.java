package practice;

import java.util.Scanner;

public class pattern5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		//start the format
		for(int i = 1; i <=n ;i++) {
			for(int j = 1;j <=n ; j++) {
				System.out.print((char)('A'+j -1));
			}
			System.out.println();
		}

	}

}
