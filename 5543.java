import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int burger = 2000;
		int drink = 2000;
		
		for(int i = 0; i < 3; i++) {
			int a = sc.nextInt();
			if(burger > a)
				burger = a;
		}
		
		for(int i = 0; i < 2; i++) {
			int b = sc.nextInt();
			if(drink > b)
				drink = b;
		}
		
		System.out.println(burger+drink-50);
	}

}
