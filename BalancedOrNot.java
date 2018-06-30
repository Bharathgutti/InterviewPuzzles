package Solutions;
import java.io.IOException;
import java.util.Scanner;

public class BalancedOrNot {

	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		String[] expressionsArray;
		expressionsArray = new String[n];
		for(int x = 0; x < n; x++) {
			expressionsArray[x] = scan.nextLine();
		}
		
		int m = scan.nextInt();
		//String[] expressionsArray = {"<<>>>","<>><","<<<<<>"};
		//int[] maxReplacements =  {1,2,3};
		int[] maxReplacements;
		maxReplacements = new int[m];
		for(int y = 0; y < n; y++) {
			maxReplacements[y] = scan.nextInt();
		}
		int[] outPut;
		outPut = balancedOrNot(expressionsArray,maxReplacements);
		for(int i=0;i<outPut.length;i++){
		    System.out.println(outPut[i]);
		}
	}
	static int[] balancedOrNot(String[] expressions, int[]
			maxReplacements) {
		int openCounter;
		int closeCounter;
		int[] outPutArray;
		outPutArray = new int[maxReplacements.length];
		for(int i = 0; i < expressions.length; i++) {
			openCounter = 0;
			closeCounter = 0;
			for(int j=0; j< expressions[i].length(); j++)
			{
				if(expressions[i].charAt(j)=='<')
				{
					openCounter++;
				}
				else if(expressions[i].charAt(j)=='>')
				{
					if(openCounter>0)
					{
						openCounter--;
					}
					else
					{
						closeCounter++;
					}
				}
				
			}
			if(openCounter == 0 && closeCounter <= maxReplacements[i]) {
				outPutArray[i] = 1;
			}
			else {
				outPutArray[i] = 0;
			}
		}
				return outPutArray;
	}
}
