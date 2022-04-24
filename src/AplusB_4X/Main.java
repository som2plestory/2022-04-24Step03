package AplusB_4X;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = null;
		while((a=sc.next())!=null && a.length()!=0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			System.out.println(n+m);
		}
		
		sc.close();
	}
}

