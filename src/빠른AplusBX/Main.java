package 빠른AplusBX;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = n/10; //10의 자리
		int b = n%10; //1의 자리
		int n1=a+b;
		int sum = 0;
		while(true) {
			sum++;
			if(n1==n) {
				System.out.println(sum);
				break;
			}else {
			a=b*10;
			b=a;
			n1=a+b;
			}
		}
		sc.close();
		
	}
}