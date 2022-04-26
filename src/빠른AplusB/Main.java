package 빠른AplusB;

import java.io.*; //*로 한번에 패키지를 불러올 수 있음
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //input
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //output
	
	StringTokenizer st;
	
	int T = Integer.parseInt(br.readLine()); //Integer.parseInt: 문자열을 정수로 치환
	
	for(int i=0;i<T;i++) {
	st = new StringTokenizer(br.readLine());
	
	bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
	}
	
	br.close();
	bw.flush();
	bw.close();
	}
}
