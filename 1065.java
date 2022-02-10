import java.util.Scanner;

public class Main {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if (num < 100) {
			System.out.println(num);
		} else {
			int count = 99;
			
			for (int i = 100; i <= num ; i++) {
				int a = i % 10;
				int b = (i % 100) / 10;
				int c = i / 100;
				
				if ((a - b) == (b - c)) {
					count++;
				}
			}
			
			System.out.println(count);
		}
	}
	
}