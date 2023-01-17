import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		if (N == 0) {
			System.out.println(N);
		} else {
			while (N != 0) {
				sb.append(Math.abs(N % -2));
				N = (int)Math.ceil((double)N / -2);
			}
			
			System.out.println(sb.reverse());
		}
	}
	
}