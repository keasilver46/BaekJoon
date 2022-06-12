import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {	
		int N = sc.nextInt();
		int count = 0;
		
		for (int i = 0; i < N; i++) {
			if (check() == true) {
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	public static boolean check() {
		String str = sc.next();
		boolean [] alphabet = new boolean[26];
		int prev = 0;
		
		for (int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);
			
			if (prev != now) {
				if (alphabet[now - 'a'] == false) {
					alphabet[now - 'a'] = true;
					prev = now;
				} else {
					return false;
				}
			}
		}
		
		return true;
	}
	
}