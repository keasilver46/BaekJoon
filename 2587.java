import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		int sum = 0;
		int tmp;
		
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			sum += num[i];
		}
		
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if (num[i] > num[j]) {
					tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
			}
		}
		
		System.out.println(sum/5);
		System.out.println(num[2]);
	}
	
}