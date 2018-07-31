package algo;

import java.util.Scanner;

public class Q2112 {
	static int input;
	static int n;
			
	public static void main(String[] args) {
		int answer = 0;
				
		Scanner s = new Scanner(System.in);
		input = Integer.parseInt(s.nextLine());

		
		if(input%2 ==0) {
			n = input/2;
			answer = cal1(3, n)+cal2(3, n);
			
		} 
		
		System.out.println(answer);
	}
	
	static int cal1(int value, int e) {
		int result = 1;
		for(int i = e; i > 0; i--) {
			result *= value;
		}
		return result;
	}
	
	static int cal2(int value, int e) {
		int result = 0;
		e -= 2;
		for(int i = e; i >= 0; i--) {
			result += cal1(value, i)*(i+1);
		}
		
		return result*2;
	}
}
