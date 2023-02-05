import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main { 
	
	static int[] A, tmp;
	static int count = 0;
	static int result = -1;
	static int K;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		A = new int[N];
		tmp = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		merge_sort(A, 0, N-1);
		System.out.println(result);
	}
	
	public static void merge(int[] A, int left, int mid, int right) {
		int i = left;
		int j = mid + 1;
		int t = 0;
		
		while (i <= mid && j <= right) {
			if (A[i] <= A[j]) tmp[t++] = A[i++];
			else tmp[t++] = A[j++];
		}
		
		while (i <= mid) tmp[t++] = A[i++];
		
		while (j <= right) tmp[t++] = A[j++];
		
		i = left;
		t = 0;
		
		while (i <= right) {
			count++;
			if (K == count) {
				result = tmp[t];
				break;
			}
			A[i++] = tmp[t++];
		}
	}
	
	public static void merge_sort(int[] A, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			merge_sort(A, left, mid);
			merge_sort(A, mid + 1, right);
			merge(A, left, mid, right);
		}
	}

}