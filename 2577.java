import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int result = a * b * c;
		int count[] = new int[10];
		
		while (result > 0) {
			count[result % 10]++;
			result = result / 10;
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println(count[i]);
		}
	}

}
