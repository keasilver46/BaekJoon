import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int i = 0; i < T; i++) {
			Stack<Character> stack = new Stack<>();
			String str = sc.next();
			
			for (int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				
				if (ch == '(') {
					stack.push(ch);
				} else if (stack.empty()) {
					stack.push(ch);
					break;
				} else {
					stack.pop();
				}
			}
			
			if (stack.empty()) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
	
}