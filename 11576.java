import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int m = sc.nextInt();
		int[] nums = new int[m];
		for (int i = 0; i < m; i++) {
			nums[i] = sc.nextInt();
		}
		
		int n = 1;
		int res = 0;
		
		for (int i = m-1; i >= 0; i--) {
			res += nums[i] * n;
			n *= A;
		}
		
		Stack<Integer> s = new Stack<Integer>();
		while (res > 0) {
			s.push(res % B);
			res /= B;
		}
		
		while (!s.isEmpty()) {
			System.out.print(s.pop() + " ");
		}
	}
	
}