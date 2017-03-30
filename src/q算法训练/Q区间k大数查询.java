package q算法训练;

import java.util.Scanner;

public class Q区间k大数查询 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt();//序列的长度
		int[] num=new int[n];
		
		for(int i=0;i<n;i++){
			num[i]=in.nextInt();
		}
		
		int m=in.nextInt();//查询的个数
		int[][] mss=new int[m][3];
		
		for(int i=0;i<m;i++){
			for(int j=0;j<3;j++){
				mss[i][j]=in.nextInt();
			}
		}
		
		for(int i=0;i<m;i++){
			k(num,mss[i][0],mss[i][1],mss[i][2]);
		}
	}
	
	static void k(int[] a,int start,int end,int index){
		int[] h=new int[end-start+1];
		int k=0;
		for(int i=start-1;i<end;i++){
			h[k++]=a[i];
		}
		
		for(int i=0;i<h.length;i++){
			for(int j=i;j<h.length;j++){
				if(h[i]<h[j]){
					int temp=h[j];
					h[j]=h[i];
					h[i]=temp;
				}
			}
		}
		
		System.out.println(h[index-1]);
	}
}
