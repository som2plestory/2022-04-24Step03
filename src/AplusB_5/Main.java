package AplusB_5;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			System.out.println("Case #"+(i+1)+": "+(n+m));
		}
		sc.close();
	}
}

