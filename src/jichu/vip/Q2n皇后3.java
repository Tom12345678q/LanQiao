package jichu.vip;

import java.util.Scanner;
/**
 * 白皇后=2
 * 黑皇后=-1
 * @author 丁赵雷
 *
 */
public class Q2n皇后3 {
	static Scanner in=new Scanner(System.in);
	static int count=0;
	int ok;
	public static void main(String[] args) {
		
		int n=in.nextInt();
		int[][] q=new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				q[i][j]=in.nextInt();
			}
		}
		
		
		new Q2n皇后3().searchWhite(0, q);
		System.out.println("count="+count);
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(q[i][j]);
			}
			System.out.println();
		}
	}
	
	
	//先放白皇后
	void searchWhite(int cur,int[][] q){
		
		if(cur==q.length){
			count++;//到这一步时说明n个皇后已放好 方法加一
		}else{
			for(int i=0;i<q.length;i++){//i在这代表着列
				if(q[cur][i]==0||q[cur][i]==2){//此处不能放皇后
					continue;
				}else{
					ok=1;
					q[cur][i]=2;//放一个白皇后
					for(int j=0;j<cur;j++){
						//检查是否与前面所放的皇后有冲突
						for(int k=0;k<q.length;k++){
							if(q[k][i]==2||(cur-i==j-k&&q[j][k]==2)||(i+cur==k+j&&q[j][k]==2)){
								q[cur][i]=1;
								ok=0;
							}
						}
					}
				}
				if(ok==1){
					searchWhite(cur+1, q);
				}
			}
		}
	}

}
