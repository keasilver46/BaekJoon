import java.util.Scanner;

public class Main {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int sum = 0;
		int count = 1;
		
		while (true) {
			if (X > sum + count) {
				sum += count;
				count++;
			} else {
				if ((count+1) % 2 == 1) {
					System.out.println((X-sum) + "/" + ((count+1)-(X-sum)));
					break;
				} else {
					System.out.println(((count+1)-(X-sum)) + "/" + (X-sum));
					break;
				}
			}
		}
	}
	
}