import java.util.Scanner;

public class Main {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			
			if (x == 0 && y == 0 && z == 0) break;
			
			if (x*x == y*y + z*z) {
				System.out.println("right");
			} else if (y*y == x*x + z*z) {
				System.out.println("right");
			} else if (z*z == x*x + y*y) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}
	}
	
}