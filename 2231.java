import java.util.Scanner;

public class Main {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		int M = 0;
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			int num = i;
			int result = 0;
			
			while (num != 0) {
				result += num % 10;
				num /= 10;
			}
			
			if (N == result + i) {
				M = i;
				break;
			}
		}
		
		System.out.println(M);
	}
	
}