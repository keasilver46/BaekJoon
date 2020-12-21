import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int H = in.nextInt();
		int M = in.nextInt();
		int hour, minute;
		
		if (H>0 && M<45) {
			hour = H-1;
			minute = (M+60)-45;
		} 
		else if (H == 0 && M<45) {
			hour = 23;
			minute = (M+60)-45;
		}
		else {
			hour = H;
			minute = M-45;
		}
		
		System.out.printf("%d %d", hour, minute);
				
	}

}
