import java.util.Scanner;

public class Main {
	
	static int factorial(int n) {
		if (n <= 1) {
			return 1;
		}
		
		return n * factorial(n - 1);
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		System.out.println(factorial(N) / (factorial(K) * factorial(N-K)));
	}

}