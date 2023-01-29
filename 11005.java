import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int B = sc.nextInt();
		Stack ans = new Stack();
		
		while (N > 0) {
			int num = N % B;
			if (num >= 10) {
				ans.push((char)(num + 'A' - 10));
			} else {
				ans.push(num);
			}
			
			N /= B;
		}
		
		while (!ans.isEmpty()) {
			System.out.print(ans.pop());
		}
	}
	
}