import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] grid = new int[9][9];
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				grid[i][j] = sc.nextInt();
			}
		}
		
		int max = grid[0][0];
		int r = 1;
		int c = 1;
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (grid[i][j] > max) {
					max = grid[i][j];
					r = i + 1;
					c = j + 1;
				}
			}
		}
		
		System.out.println(max);
		System.out.print(r + " " + c);
	}
	
}