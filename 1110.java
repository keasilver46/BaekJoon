import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a = N;
		int count = 0;
		
		while(N != a || count == 0) {		
			a = ((a%10)*10) + ((a/10)+(a%10))%10;
			count++;
		}
		
		System.out.println(count);
	}

}
