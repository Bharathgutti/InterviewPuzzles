package Solutions;

import java.io.IOException;
import java.util.Scanner;

public class BuyingShowTickets {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] tickets;
		tickets = new int[n];
		for(int x = 0; x < n; x++) {
			tickets[x] = scan.nextInt();
		}
		int p = scan.nextInt();
		long waitingTime = waitingTime(tickets, p);
		System.out.println(waitingTime);
		
	}
	
	static long waitingTime(int[] tickets, int p) {
		long waitingTime = 0;
		int i = 0;
		while(tickets[p] != 0) {
			if(tickets[i] > 0) {
				tickets[i]--;
				waitingTime++;
			}
			if(i == tickets.length - 1 ) {
				i = 0;
			}
			else {
				i++;
			}
		}
		return waitingTime;
	
	}
}

