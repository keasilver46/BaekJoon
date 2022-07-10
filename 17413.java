import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Stack<Character> stack = new Stack<>();
		
		boolean check = false;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '<') {
				while (!stack.isEmpty()) {
					System.out.print(stack.pop());
				}
				check = true;
				System.out.print(str.charAt(i));
			}
			
			else if (str.charAt(i) == '>') {
				check = false;
				System.out.print(str.charAt(i));
			}
			
			else if (check) {
				System.out.print(str.charAt(i));
			}
			
			else {
				if (str.charAt(i) == ' ') {
					while (!stack.isEmpty()) {
						System.out.print(stack.pop());
					}
					System.out.print(str.charAt(i));
				}
				
				else {
					stack.push(str.charAt(i));
				}
			}
		}
		
		while (!stack.isEmpty()) {
			System.out.print(stack.pop());
		}
	}
	
}