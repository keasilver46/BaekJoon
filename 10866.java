import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static int[] deque;
	public static int size = 0;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		deque = new int[N];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			
			switch(str) {
			case "push_front":
				push_front(Integer.parseInt(st.nextToken()));
				break;
			case "push_back":
				push_back(Integer.parseInt(st.nextToken()));
				break;
			case "pop_front":
				sb.append(pop_front()).append("\n");
				break;
			case "pop_back":
				sb.append(pop_back()).append("\n");
				break;
			case "size":
				sb.append(size()).append("\n");
				break;
			case "empty":
				sb.append(empty()).append("\n");
				break;
			case "front":
				sb.append(front()).append("\n");
				break;
			case "back":
				sb.append(back()).append("\n");
				break;
			}
		}
		
		System.out.println(sb);
	}
	
	public static void push_front(int X) {
		if (size == 0) {
			deque[0] = X;
		} else {
			for (int i = size; i> 0; i--) {
				deque[i] = deque[i-1];
			}
			deque[0] = X;
		}
		size++;
	}
	
	public static void push_back(int X) {
		deque[size] = X;
		size++;
	}
	
	public static int pop_front() {
		if (size == 0) {
			return -1;
		} else {
			int pop = deque[0];
			for (int i = 0; i < size; i++) {
				deque[i] = deque[i+1];
			}
			size--;
			return pop;
		}
	}
	
	public static int pop_back() {
		if (size == 0) {
			return -1;
		} else {
			int pop = deque[size-1];
			size--;
			return pop;
		}
	}
	
	public static int size() {
		return size;
	}
	
	public static int empty() {
		if (size == 0) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public static int front() {
		if (size == 0) {
			return -1;
		} else {
			return deque[0];
		}
	}
	
	public static int back() {
		if (size == 0) {
			return -1;
		} else {
			return deque[size-1];
		}
	}
	
}