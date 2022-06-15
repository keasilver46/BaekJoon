import java.util.Scanner;

public class Main {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		while ((n = sc.nextInt()) != 0) {
			boolean [] arr = new boolean[2*n+1];
			int count = 0;
			
			arr[1] = true;
			
			for (int i = 2; i <= 2*n; i++) {
				for (int j = 2; i*j <= 2*n; j++) {
					arr[i*j] = true;
				}
			}
			
			for (int i = n+1; i <= 2*n; i++) {
				if (!arr[i]) {
					count++;
				}
			}
			
			System.out.println(count);
		}
	}
	
}