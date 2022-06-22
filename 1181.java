import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){	
		Scanner sc= new Scanner(System.in);
		
		int N = sc.nextInt();
		String[] str = new String[N];
		
		for (int i = 0; i < N; i++) {
			str[i] = sc.next();
		}
		
		Arrays.sort(str, new Comparator<String>() {
			public int compare(String s1, String s2) {
				if (s1.length() == s2.length()) {
					return s1.compareTo(s2);
				} else {
					return s1.length() - s2.length();
				}
			}
		});
		
		System.out.println(str[0]);
		
		for (int i = 1; i < N; i++) {
			if (!str[i].equals(str[i-1])) {
				System.out.println(str[i]);
			}
		}
	}
	
}