import java.util.Scanner;

public class Main {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		int a, b;
		int min;
		
		if (x < w-x) {
			a = x;
		} else {
			a = w-x;
		}
		
		if (y < h-y) {
			b = y;
		} else {
			b = h-y;
		}
		
		if (a < b) {
			min = a;
		} else {
			min = b;
		}
		
		System.out.println(min);
	}

}