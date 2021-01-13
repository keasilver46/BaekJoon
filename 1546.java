import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double score[] = new double[n];
		double max = 0;
		double m;
		double sum = 0;
		double avr;
		
		for (int i = 0; i < n; i++) {
			score[i] = sc.nextInt();
			if (score[i] > max) {
				max = score[i];
			}
		}
		
		m = max;
		for (int i = 0; i < n; i++) {
			score[i] = score[i]/m*100;
			sum = sum + score[i];
		}
		
		avr = sum/n;
		System.out.println(avr);
	}

}