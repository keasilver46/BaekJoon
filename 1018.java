import java.util.Scanner;

public class Main {
	
	static char[][] chess;
	static int min = 64;
	
	public static void main(String[] args){	
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		chess = new char[N][M];
		
		for (int i = 0; i < N; i++) {
			String str = sc.next();
			
			for (int j = 0; j < M; j++) {
				chess[i][j] = str.charAt(j);
			}
		}
		
		for (int i = 0; i < N-7; i++) {
			for (int j = 0; j < M-7; j++) {
				find(i, j);
			}
		}
		
		System.out.println(min);
	}
	
	public static void find(int x, int y) {
		char color = chess[x][y];
		int count = 0;
		
		
		for (int i = x; i < x+8; i++) {
			for (int j = y; j < y+8; j++) {
				if (chess[i][j] != color) {
					count++;
				}
				
				if (color == 'W') color = 'B';
				else color = 'W';
			}
			
			if (color == 'W') color = 'B';
			else color = 'W';
		}
		
		count = Math.min(count, 64-count);
		min = Math.min(min, count);
	}
	
}