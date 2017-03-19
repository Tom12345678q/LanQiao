package jichu.vip;

import java.util.Scanner;

/**
 * 这是我自己写的
 * @author 丁赵雷
 *
 */
public class Q2n皇后1 {
	static Scanner in=new Scanner(System.in);
	static int n=in.nextInt();
	static int[] q=new int[n];//n是这个皇后所在行处 quee[1]是列数
	
	static int tot=0;//计数
	public static void main(String[] args) {

		search(0);
		System.out.println(tot);
	}
	
	//回溯法 cur当前行数
 	static void search(int cur){
		if(cur==q.length){
			tot++;//递归边界，只要走到了这里，所有皇后必然不冲突
		}else{
			for(int i=0;i<q.length;i++){
				int ok=1;
				q[cur]=i;//在cur行i列放一个皇后
				for(int j=0;j<cur;j++){
					//检查是否和前面的皇后冲突 不能在同一行，同一列，同一对角线
					if(q[cur]==q[j]||cur-q[cur]==j-q[j]||cur+q[cur]==j+q[j]){
						ok=0;
						break;
					}
				}
				if(ok==1){
					search(cur+1);
				}
			}
		}
		
			
	}
}
