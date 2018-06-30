package Solutions;
import java.io.IOException;
import java.util.Scanner;

public class FindTheWinner {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] andrea;
		andrea = new int[n];
		for(int x = 0; x < n; x++) {
			andrea[x] = scan.nextInt();
			System.out.println(andrea[x]);
		}
		int m = scan.nextInt();
		int[] maria;
		maria = new int[m];
		for(int y = 0; y < n; y++) {
			maria[y] = scan.nextInt();
			System.out.println(maria[y]);
		}
		scan.nextLine();
		String s = scan.nextLine();
		System.out.println(s);
		String Winner = winner(andrea, maria, s);
		System.out.println(Winner);
	}
	
	static String winner(int[] andrea, int[] maria, String s) {
		String Winner;
		int andreaScore = 0;
		int mariaScore = 0;
		if(s.equalsIgnoreCase("Odd")) {
			for(int i = 1; i< andrea.length; i = i + 2) {
				andreaScore = andreaScore + (andrea[i] - maria[i]);
				mariaScore = mariaScore + (maria[i] - andrea[i]);
			}
		}
		else if(s.equalsIgnoreCase("Even")) {
			for(int i = 0; i< andrea.length; i = i + 2) {
				andreaScore = andreaScore + (andrea[i] - maria[i]);
				mariaScore = mariaScore + (maria[i] - andrea[i]);
			}
		}
		if(andreaScore > mariaScore) {
			Winner = "Andrea";
		}
		else if(mariaScore > andreaScore) {
			Winner = "Maria";
		}
		else {
			Winner = "Tie";
		}
		return Winner;
	}
}
