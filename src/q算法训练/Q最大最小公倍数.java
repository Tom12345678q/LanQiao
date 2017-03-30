package q算法训练;

import java.util.Scanner;

public class Q最大最小公倍数 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		long n=in.nextLong();
		
		if(n>2){
			if(n%2==0){
				if(n%3==0){
					System.out.println((n-1)*(n-2)*(n-3));
				}else{
					System.out.println((n-1)*(n)*(n-3));
				}
			}else{
				System.out.println(n*(n-1)*(n-2));
			}
			
		}
		if(n==2){
			System.out.println(2);
		}
		if(n==1){
			System.out.println(1);
		}
	}
}
