package 더하기사이클;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int n1 = 10*(n%10) + ((n/10 + n%10))%10;
		int i=0;
		while(true) {
			i++;
			if(n1==n) {
				System.out.println(i);
				break;
			}else {
				int a = n1%10;
				int n2 = n1/10 + a;
				int b = n2%10;
				n1 = a*10 +b ;
			}
		} 

		sc.close();
	}
}

