import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Stack<Character> stLeft = new Stack<>();
		Stack<Character> stRight = new Stack<>();
		
		String str = br.readLine();
		int M = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < str.length(); i++) {
			stLeft.push(str.charAt(i));
		}
		
		for (int i = 0; i < M; i++) {
			String command = br.readLine();
			char c = command.charAt(0);
			
			switch(c) {
			case 'L':
				if (!stLeft.isEmpty()) {
					stRight.push(stLeft.pop());
				}
				break;
			case 'D':
				if (!stRight.isEmpty()) {
					stLeft.push(stRight.pop());
				}
				break;
			case 'B':
				if (!stLeft.isEmpty()) {
					stLeft.pop();
				}
				break;
			case 'P':
				char ch = command.charAt(2);
				stLeft.push(ch);
			}
		}
		
		while (!stLeft.isEmpty()) {
			stRight.push(stLeft.pop());
		}
		
		while (!stRight.isEmpty()) {
			sb.append(stRight.pop());
		}
		
		System.out.println(sb);
	}
	
}