import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] student = new int[31];
		
		for (int i = 0; i < 28; i++) {
			int ch = Integer.parseInt(br.readLine());
			student[ch] = 1;
		}
		
		for (int i = 1; i < 31; i++) {
			if (student[i] == 0) {
				System.out.println(i);
			}
		}
	}
	
}