import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num[] = new int[10];
		int result[] = new int[42];
		int count = 0;
		
		for (int i = 0; i < 10; i++) {
			num[i] = sc.nextInt();
			result[num[i]%42]++;
		}
		
		for (int i = 0; i < 42; i++) {
			if (result[i] != 0) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
