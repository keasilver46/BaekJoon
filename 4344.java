import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int arr[];
		
		for (int i = 0; i < c; i++) {
			int n = sc.nextInt();
			double sum = 0;
			double count = 0;
			double avr;
			double rate;
			
			arr = new int[n];
			
			for (int j = 0; j < n; j++) {
				arr[j] = sc.nextInt();
				sum += arr[j];
			}
			
			avr = sum/n;
			
			for (int j = 0; j < n; j++) {
				if (arr[j] > avr) {
					count++;
				} 
			}
			
			rate = (count/n)*100;
			System.out.println(String.format("%.3f", rate) + "%");
		}
	}

}