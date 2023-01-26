import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		String B = sc.next();
		int N = sc.nextInt();
		int tmp = 1;
		int ans = 0;
		
		for (int i = B.length()-1; i >= 0; i--) {
			char c = B.charAt(i);
			
			if (c >= 'A' && c <= 'Z') {
				ans += (c - 'A' + 10) * tmp;
			} else {
				ans += (c - '0') * tmp;
			}
			
			tmp *= N;
		}
		
		System.out.println(ans);
	}
	
}