import java.util.Scanner;

public class Main {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		int scale[] = new int[8];
		String str = "";
		
		for (int i = 0; i < 8; i++) {
			scale[i] = sc.nextInt();
		}
		
		for (int i = 0; i < 7; i++) {
				
			if (scale[i+1] == scale[i]+1) {
				str = "ascending";
			} 
			else if (scale[i+1] == scale[i]-1) {
				str = "descending";
			} 
			else {
				str = "mixed";
				break;
			}
				
		}
	
		System.out.println(str);
	}

}