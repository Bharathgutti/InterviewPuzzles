package Solutions;

import java.io.IOException;
import java.util.Scanner;

public class LargestSubsetSum {
	
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] k;
		k = new int[n];
		for(int x = 0; x < n; x++) {
			k[x] = scan.nextInt();
		}
		//int[] k = {2,4};
		long[] maxSubsetSum = maxSubsetSum(k);
		for(int i=0;i<maxSubsetSum.length;i++){
		    System.out.println(maxSubsetSum[i]);
		}
	}
	
	static long[] maxSubsetSum(int[] k) {
		long[] subsetsSum;
		subsetsSum = new long[k.length];
		int sum;
		int LIM;
		int N;
		for(int i = 0; i< k.length; i++) {
			sum = 0;
			N = k[i];
			LIM = (int) Math.sqrt(N);
			for (int j = 1; j <= LIM; j++) {
				if (N % j == 0) {
					if (j == (N / j))
						sum += j;
					else
						sum += (j + N / j);
				}
			}
			subsetsSum[i] = sum;
		}
		return subsetsSum;
	}

}
