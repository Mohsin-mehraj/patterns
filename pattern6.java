package practice;

import java.util.Scanner;

public class pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
			for (int i = 1 ; i <= n ;i++) {
				char starting = ((char)('A' + i -1));
				for(int j = 1;j <=n ;j++) {
					System.out.print(starting);
					starting ++;
				}
				System.out.println();
				
			}
}
}