package jichu;

import java.util.Scanner;

/*
 * 问题描述
给出一个包含n个整数的数列，问整数a在数列中的第一次出现是第几个。
输入格式
第一行包含一个整数n。
第二行包含n个非负整数，为给定的数列，数列中的每个数都不大于10000。
第三行包含一个整数a，为待查找的数。
输出格式
如果a在数列中出现了，输出它第一次出现的位置(位置从1开始编号)，否则输出-1。
 */
public class Q查找整数 {
	static Scanner io=new Scanner(System.in);
	public static void main(String[] args) {
		int count=0;
		int n=io.nextInt();
		int[] number=new int[n];
		for(int i=0;i<n;i++){
			number[count]=io.nextInt();
			count++;
		}
		
		int a=io.nextInt();
		boolean flag=true;
		for(int i=0;i<number.length;i++){
			if(number[i]==a){
				flag=false;
				System.out.println(i+1);
				break;
			}
		}
		if(flag){
			System.out.println(-1);
		}
		
		
	}
}
