package san.yi;

import java.util.Scanner;

public class test3_3 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		long n=input.nextLong();
		
		long num=(n*(n+1))/2;
		System.out.println(num);
	}

}
