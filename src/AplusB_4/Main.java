package AplusB_4;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) { //boolean타입) 입력이 있을 때만 실행
			System.out.println(sc.nextInt()+sc.nextInt());
		}
		
		sc.close();
	}
}

