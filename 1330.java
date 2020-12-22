import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		
		if(A > B)
			System.out.println(">");
		else if(A < B)
			System.out.println("<");
		else
			System.out.println("==");
	}

}
