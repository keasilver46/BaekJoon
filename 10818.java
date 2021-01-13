import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
<<<<<<< HEAD
		// TODO Auto-generated method stub
=======
		
>>>>>>> ad44db18dfb7970acf71c8c356ae40154ac8246f
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int max = -1000000;
		int min = 1000000;
		
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			
			if(a[i] > max) {
				max = a[i];
			}
			if(a[i] < min) {
				min = a[i];
			}
		}
		
		System.out.println(min + " " + max);
	}

}
