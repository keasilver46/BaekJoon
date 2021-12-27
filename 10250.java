import java.util.Scanner;

public class Main {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
			
			int Y = n % h;
			int X = (n/h) + 1;
			
			if (Y == 0) {
				Y = h;
				X = n/h;
			}
			
			System.out.println(Y * 100 + X);
		}
	}
	
}