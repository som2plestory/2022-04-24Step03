package X보다작은수;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] aArray = new int[N]; 
		
		int X = sc.nextInt();
		
		for(int i=0; i<aArray.length; i++) {
			int a_i = sc.nextInt();
			aArray[i]= a_i;
		}
		
		for(int i=0; i<aArray.length;i++) {
			if(aArray[i]<X) {
				System.out.print(aArray[i]+" ");
			}
		}
		
		sc.close();
	}
}