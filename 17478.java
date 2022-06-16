import java.util.Scanner;

public class Main {
	static String line = "";

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
		recursion(N);
	}
	
	public static void recursion(int n) {
		String underBar = line;
		
		if (n == 0) {
			System.out.println(underBar + "\"����Լ��� ������?\"");
			System.out.println(underBar + "\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
			System.out.println(underBar + "��� �亯�Ͽ���.");
			return;
		}
		
		System.out.println(underBar + "\"����Լ��� ������?\"");
		System.out.println(underBar + "\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
		System.out.println(underBar + "���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
		System.out.println(underBar + "���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
		
		line += "____";
		recursion(n-1);
		System.out.println(underBar + "��� �亯�Ͽ���.");
	}
	
}