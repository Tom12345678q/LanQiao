package jichu.vip;

import java.util.Scanner;

public class Q回型取数 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int m=input.nextInt(),n=input.nextInt();
		int[][] arr=new int[m][n];
		int[] num=new int[m*n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				arr[i][j]=input.nextInt();
			}
		}
		int k=m-1,h=n-1,count=0,j=0;//k为最后一行  h为最后一列  k h j是变化的
		while(true){
			

			//向下走
			for(int i=j;i<=k;i++){
				num[count]=arr[i][j];
				count++;
			}
			//向右走
			for(int i=j+1;i<=h;i++){
				num[count]=arr[i][j];
				count++;
			}
			//向上走
			for(int i=k-1;i>=j;i--){
				num[count]=arr[i][j];
				count++;
			}
			//向左走
			for(int i=h-1;i>j;i--){
				num[count]=arr[i][j];
				count++;
			}
			if(count>=m*n-1)
				break;
			j++;
			k--;
			h--;
		}
		
		for(int i=0;i<m*n-1;i++){
			
		}

	}
	

}
