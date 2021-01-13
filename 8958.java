import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String arr[] = new String[n];
		
		for (int i = 0; i < n; i++) {
			int count = 0;
			int total = 0;
			arr[i] = sc.next();
			
			for (int j = 0; j < arr[i].length(); j++) {
				if (arr[i].charAt(j) == 'O') {
					count++;
				} else {
					count = 0;
				}
				total += count;
			}
			
			System.out.println(total);
		}
	}

}