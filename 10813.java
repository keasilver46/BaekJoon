import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] basket = new int[N+1];
		
		for (int i = 1; i <= N; i++) {
			basket[i] = i;
		}
		
		for (int a = 0; a < M; a++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int tmp;
			
			tmp = basket[i];
			basket[i] = basket[j];
			basket[j] = tmp;
		}
		
		for (int i = 1; i <= N; i++) {
			System.out.print(basket[i] + " ");
		}
	}

}