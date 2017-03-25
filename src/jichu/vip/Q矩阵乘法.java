package jichu.vip;

import java.io.IOException;
import java.util.Scanner;

public class Q矩阵乘法 {
	public static void main(String[] args) throws IOException {
		//用这种方式可以提高 读写速度
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in) );
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		int[][] a=new int[n][n];
		int[][] b=new int[n][n];
		int[][] c=new int[n][n];
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				a[i][j]=b[i][j]=in.nextInt();
			}
		}
		
		
		
		
		if(m>=2){//m==2只循环一次
			for(int i=1; i<m; i++){
				for(int j=0; j<n; j++){
					for(int k=0; k<n; k++){
						int sum=0;
						for(int s=0;s<n;s++){
							sum=sum+a[j][s]*b[s][k];
						}
						c[j][k]=sum;
					}
					
				}
				
				//把数组的值赋给b
				for(int u=0;u<n;u++){
					for(int l=0;l<n;l++){
						b[u][l]=c[u][l];
					}
				}
			}
			
			for(int p=0;p<n;p++){
				for(int q=0;q<n;q++){
					System.out.print(c[p][q]+" ");
				}
				System.out.println();
			}
		}
		
		if(m==1){
			for(int p=0;p<n;p++){
				for(int q=0;q<n;q++){
					System.out.print(a[p][q]+" ");
				}
				System.out.println();
			}
		}
		
		if(m==0){
			for(int p=0;p<n;p++){
				for(int q=0;q<n;q++){
					if(p==q){
						System.out.print(1+" ");
					}else{
						System.out.print(0+" ");
					}
				}
				System.out.println();
			}
		}
	}
}
