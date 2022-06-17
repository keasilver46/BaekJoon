import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int [] x = new int[N];
		int [] y = new int[N];
		int [] rank = new int[N];
		
		for (int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		
		for (int i = 0; i < N; i++) {
			int k = 0;
			for (int j = 0; j < N; j++) {
				if (x[i] < x[j] && y[i] < y[j]) {
					k++;
				}
			}
			
			rank[i] = k + 1;
		}
		
		for (int i = 0; i < N; i++) {
			System.out.print(rank[i] + " ");
		}
	}
	
}