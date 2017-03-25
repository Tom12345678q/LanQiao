package jichu.vip;

import java.util.Scanner;

public class Q时间转换 {
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		
		int h=0;//时
		int m=0;//分
		int s=0;//秒
		
		h=n/3600;
		m=(n-h*3600)/60;
		s=n-h*3600-m*60;
		System.out.println(h+":"+m+":"+s);
	}

}
