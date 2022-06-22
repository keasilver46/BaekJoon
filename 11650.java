import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){	
		Scanner sc= new Scanner(System.in);
		
		int N = sc.nextInt();
		int[][] arr = new int[N][2];
		
		for (int i = 0; i < N; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		Arrays.sort(arr, (arr_1, arr_2) -> {
			if (arr_1[0] == arr_2[0]) {
				return arr_1[1] - arr_2[1];
			} else {
				return arr_1[0] - arr_2[0];
			}
		});
		
		for (int i = 0; i < N; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}
	
}