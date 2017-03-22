package jichu.vip;

import java.util.Scanner;

/**
 * 再解这个题时主要用了一些离散数学的抽屉原理
 * 
 * 好芯片多于坏芯片那么  好芯片的测量结果的1的数量肯定大于0的数量
 * @author 丁赵雷
 *
 */
public class Q芯片测试 {
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt();
		
		int[][] num=new int[n+1][n+1];
		
		for(int i=1;i<n+1;i++){
			for(int j=1;j<n+1;j++){
				num[i][j]=in.nextInt();
			}
		}
		
		int m=0;
		if(n%2==1){
			m=(n+1)/2;
		}else{
			m=n/2;
		}
		int count=0;
		for(int i=1;i<n+1;i++){
			for(int j=1;j<n+1;j++){
				if(num[j][i]==1){//一列一列的测
					count++;
				}
			}
			if(count>m){
				if(i<n){
					System.out.print(i+" ");					
				}else{
					System.out.print(i);
				}
			}
			count=0;//重置
		}
		
	}

}
