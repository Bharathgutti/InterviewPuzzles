package Solutions;

import java.io.IOException;
import java.util.Scanner;

public class InTheFuture {
	
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int K = scan.nextInt();
		int P = scan.nextInt();
		int minDays = minNum(A, K, P);
		System.out.println(minDays);
	}
	
	static int minNum(int A, int K, int P) {
		int minDays = 0;
		int TA = P;
		int TK = 0;
		if(A >= K && P > 0) {
			minDays = -1;
		}
		else {
			while(TK <= TA) {
				TK = TK + K;
				TA = TA + A;
				minDays++;
			}
		}
		return minDays;
	}

}
