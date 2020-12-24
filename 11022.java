import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		for(int i = 1; i <= x; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = A + B;
			
			System.out.println("Case #" + i + ": " + A + " + " + B + " = " + C);
		}
	}

}
