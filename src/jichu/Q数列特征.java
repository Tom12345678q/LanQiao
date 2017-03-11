package jichu;

import java.util.Arrays;
import java.util.Scanner;

public class Q数列特征 {
	static Scanner io=new Scanner(System.in);
	public static void main(String[] args) {
		int sum = 0,min,max;
		
		
		int n=io.nextInt();
		int[] number=new int[n];
		
		for(int i=0;i<n;i++){
			number[i]=io.nextInt();
		}
		
		Arrays.sort(number);
		min=number[0];
		max=number[n-1];
		for(int i=0;i<n;i++){
			sum=sum+number[i];
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
		
	}
}
