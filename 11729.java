import java.util.Scanner;

public class Main {
	
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args){	
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		sb.append((int)Math.pow(2, N) - 1 + "\n");
		
		Hanoi(N, 1, 2, 3);
		
		System.out.println(sb);
	}
	
	public static void Hanoi(int N, int from, int mid ,int to) {
		if (N == 1) {
			sb.append(from + " " + to + "\n");
			return;
		}
		
		Hanoi(N-1, from, to, mid);
		
		sb.append(from + " " + to + "\n");
		
		Hanoi(N-1, mid, from, to);
	}
	
}