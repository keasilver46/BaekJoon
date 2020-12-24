package _10039;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, e;
		int score;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		
		if(a < 40)
			a = 40;
		if(b < 40)
			b = 40;
		if(c < 40)
			c = 40;
		if(d < 40)
			d = 40;
		if(e < 40)
			e = 40;
		
		score = (a+b+c+d+e)/5;
		
		System.out.println(score);
	}

}
