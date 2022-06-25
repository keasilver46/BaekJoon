import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws Exception {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			Stack<Character> stack = new Stack<>();
			String str = br.readLine() + "\n";
			
			for (char ch : str.toCharArray()) {
				if (ch == ' ' || ch == '\n') {
					while (!stack.empty()) {
						sb.append(stack.pop());
					}
					sb.append(ch);
				} else {
					stack.push(ch);
				}
			}
		}
		
		System.out.println(sb);
	}
	
}