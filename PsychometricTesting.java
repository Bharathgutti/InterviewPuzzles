package Solutions;
import java.io.IOException;
import java.util.Scanner;

public class PsychometricTesting {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] scores;
        scores = new int[n];
        for(int i = 0; i < n; i++) {
        	scores[i] = scan.nextInt();
        }
        
        int q1 = scan.nextInt();
        int[] lowerlimits;
        lowerlimits = new int[q1];
        for(int j = 0; j < q1; j++) {
        	lowerlimits[j] = scan.nextInt();
        }
        
        int q2 = scan.nextInt();
        int[] upperlimits;
        upperlimits = new int[q2];
        for(int k = 0; k < q2; k++) {
        	upperlimits[k] = scan.nextInt();
        }
        
        int[] jobOffers = jobOffers(scores,lowerlimits, upperlimits);
        for(int l =0; l < jobOffers.length; l++) {
        	System.out.println(jobOffers[l]);
        }
	}
	
	static int[] jobOffers(int[] scores, int[] lowerLimits, int[]
			upperLimits) {
		int[] jobOffers;
		int count;
		jobOffers = new int[lowerLimits.length];
		for(int i = 0; i < lowerLimits.length; i++) {
			count = 0;
			for(int j = 0; j < scores.length; j++) {
				if(scores[j] >= lowerLimits[i] && scores[j] <= upperLimits[i]) {
					count++;
				}
			}
			jobOffers[i] = count;
		}
		return jobOffers;
	}

}
