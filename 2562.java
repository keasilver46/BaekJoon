import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
<<<<<<< HEAD
		// TODO Auto-generated method stub
=======
	
>>>>>>> ad44db18dfb7970acf71c8c356ae40154ac8246f
		Scanner sc = new Scanner(System.in);
		int num[] = new int[9];
		int max = 0;
		int n = 0;
		
		for(int i = 0; i < 9; i++) {
			num[i] = sc.nextInt();
			if(num[i] > max) {
				max = num[i];
				n = i + 1;
			}
		}
		
		System.out.println(max);
		System.out.println(n);
	}

}
