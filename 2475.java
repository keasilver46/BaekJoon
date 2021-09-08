import java.util.Scanner;

public class Main {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int r;
		
		for (int i = 0; i < 5; i++) {
			int num = sc.nextInt();
			sum += num * num;
		}
		
		r = sum % 10;
		
		System.out.println(r);
	}

}