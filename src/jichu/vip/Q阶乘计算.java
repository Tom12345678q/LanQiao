package jichu.vip;

import java.util.Scanner;
/*
 * 问题描述
　　输入一个正整数n，输出n!的值。
　　其中n!=1*2*3*…*n。
算法描述
　　n!可能很大，而计算机能表示的整数范围有限，需要使用高精度计算的方法。使用一个数组A来表示一个大整数a，A[0]表示a的个位，A[1]表示a的十位，依次类推。
　　将a乘以一个整数k变为将数组A的每一个元素都乘以k，请注意处理相应的进位。
　　首先将a设为1，然后乘2，乘3，当乘到n时，即得到了n!的值。
输入格式
　　输入包含一个正整数n，n<=1000。
 */
public class Q阶乘计算 {
	static Scanner io=new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] num=new int[2571];//1000的阶乘有2570位
		
		int jw=0;//保存进位
		int temp=0;//中间值
		
		num[1]=1;
		
		int n=io.nextInt();
		io.close();
		for(int i=2;i<=n;i++){
			
			for(int j=1;j<num.length;j++){
				
				temp=num[j]*i+jw;
				jw=temp/10;
				num[j]=temp%10;
				
			}
		}
		
		boolean flag=false;
		for(int k=num.length-1;k>0;k--){
		
			if(flag){
				System.out.print(num[k]);
				continue;
			}
			
			if(num[k-1]!=0){
				flag=true;
			}
			
			
			
			
		}
	}

}
