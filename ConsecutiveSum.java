package Solutions;

import java.io.IOException;
import java.util.Scanner;

public class ConsecutiveSum {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
        long target = scan.nextInt();
        int result=consecutive(target);
        System.out.println(result);
	}
	
	static int consecutive(long num) {
	  int start = 1;
	  int next = 1;
	  int sum = 1;
	  int count=0;	

		while (start <= num/2) {
			if (sum < num) {
				next =next+1;
				sum =sum+next;
			}
			else if (sum > num) {
				sum =sum-start;
				start += 1;
			}
			else if (sum == num) {
				count++;
				sum =sum-start;
				start=start+1;
			}
		}	    
		return count;
	}
}
