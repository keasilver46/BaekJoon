import java.util.Scanner;

public class Main {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int count = 1;
		int num = 1;
		int a = 6;
		
		while (num < N) {
			count++;
			num += a;
			a += 6;
		}
		
		System.out.println(count);
	}
	
}