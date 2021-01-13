import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
<<<<<<< HEAD
		// TODO Auto-generated method stub
=======

>>>>>>> ad44db18dfb7970acf71c8c356ae40154ac8246f
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int result = a * b * c;
		int count[] = new int[10];
		
		while (result > 0) {
			count[result % 10]++;
			result = result / 10;
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println(count[i]);
		}
	}

}
