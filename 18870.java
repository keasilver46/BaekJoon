import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){	
		Scanner sc= new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] X = new int[N];
		int count = 0;
		
		for (int i = 0; i < N; i++) {
			X[i] = sc.nextInt();
		}
		
		int[] temp = X.clone();
		Arrays.sort(temp);
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < N; i++) {
			if (!map.containsKey(temp[i])) {
				map.put(temp[i], count++);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (int key : X) {
			sb.append(map.get(key)).append(" ");
		}
		
		System.out.println(sb);
	}
	
}