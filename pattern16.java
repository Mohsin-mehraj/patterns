package practice;

import java.util.Scanner;

public class pattern16 {

	public static void main(String[] args) {
	
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    
    for(int i=1;i<=n;i++){
        int sum=0;
        for(int j=1;j<=i;j++){
            sum= sum+j;
            System.out.print(j);
			if(j!=i) {
				System.out.print("+");
			}
				
        }
      
        System.out.print("="+sum);
        System.out.println();
       
       
        
        
    }

	}

}
