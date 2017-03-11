package jichu;

import java.util.Scanner;
/*
 * 利用字母可以组成一些美丽的图形，下面给出了一个例子：
ABCDEFG
BABCDEF
CBABCDE
DCBABCD
EDCBABC
这是一个5行7列的图形，请找出这个图形的规律，并输出一个n行m列的图形。
 */
public class Q字母图形 {
	static Scanner io=new Scanner(System.in);
	public static void main(String[] args) {
		char[] c={'A','B','C','D','E','F','G','H','I','J','K',
				'L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		int n=io.nextInt(); 
		int m=io.nextInt();
		
		char[][] cs=new char[n][m];
		for(int i=0;i<n;i++){
			int p=0;
			int q=0;
			int g=i;
			int j=i>m?m:i;
			for(int h=j;h>0;h--){
				cs[i][p++]=c[g];
				g--;
			}
			
			for(int k=i;k<m;k++){
				cs[i][k]=c[q++];
			}
		}

		
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.print(cs[i][j]);
			}
			System.out.println();
		}
	}

}
