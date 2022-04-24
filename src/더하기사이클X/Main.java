package 더하기사이클X;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int a = N/10;
		int b = N%10;
		int i = 0;
		
		while(true) {
			i++;
			int M = a+b;
			if(M==N) {
				break;
			}
			a = M/10;
			b = M%10;
		}
		System.out.println(i);
		
		sc.close();
	}
}

