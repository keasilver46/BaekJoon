import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Queue<Integer> queue = new LinkedList<Integer>();
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		for (int i = 1; i <= N; i++) {
			queue.add(i);
		}
		
		while (queue.size() != 1) {
			for (int i = 0; i < K; i++) {
				if (i == K-1) {
					sb.append(queue.poll()).append(", ");
				} else {
					queue.add(queue.poll());
				}
			}
		}
		
		sb.append(queue.poll()).append(">");
		System.out.println(sb);
	}
	
}