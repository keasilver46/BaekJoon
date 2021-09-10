import java.util.Scanner;

public class Main {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toUpperCase();
		
		int arr[] = new int[26];
		int max = -1;
		char c = '?';
		
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i) - 'A']++;
			
			if (max < arr[str.charAt(i) - 'A']) {
				max = arr[str.charAt(i) - 'A'];
				c = str.charAt(i);
			} else if (max == arr[str.charAt(i) - 'A']) {
				c = '?';
			}
		}
		
		System.out.println(c);
	}

}