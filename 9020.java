import java.util.Scanner;

public class Main {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		boolean [] arr = new boolean[10001];
		
		arr[1] = true;
		
		for (int i = 2; i < arr.length; i++) {
			for (int j = 2; i*j < arr.length; j++) {
				arr[i*j] = true;
			}
		}
		
		for (int i = 0; i < T; i++) {
			int n = sc.nextInt();
			int a = n/2;
			int b = n/2;
			
			while (true) {
				if (!arr[a] && !arr[b]) {
					System.out.println(a + " " + b);
					break;
				}
				
				a--;
				b++;
			}
		}
	}
	
}