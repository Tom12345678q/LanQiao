package jichu;

import java.util.Scanner;

/*
 * 输入格式
输入包含一个数n。
输出格式
输出杨辉三角形的前n行。每一行从这一行的第一个
数开始依次输出，中间使用一个空格分隔。请不要在前面输出多余的空格。 
 */
public class Q杨辉三角 {
	static Scanner io=new Scanner(System.in);
	
	//0是占位符
	public static void main(String[] args) {
		int n=io.nextInt();
		int[][] p=new int[n+1][n+1];
		
		p[1][1]=1;
		if(n>=1){
			System.out.println(1);
		}
		if(n>1){
			for(int i=2;i<n+1;i++){
				for(int j=1;j<i+1;j++){
					p[i][j]=p[i-1][j-1]+p[i-1][j];
					System.out.print(p[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
}
