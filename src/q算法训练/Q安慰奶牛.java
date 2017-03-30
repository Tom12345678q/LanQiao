package q算法训练;

import java.util.Scanner;

/**
 * 根据题意可知这是个无向图
 * 最小生成树
 * @author 丁赵雷
 *
 */
public class Q安慰奶牛 {
	
	static final int INF=Integer.MAX_VALUE;//用来表示无穷大
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();//顶点数
		int p=in.nextInt();//边数
		int[][] mMatrix=new int[n][n];//邻接矩阵
		
		//初始化邻接矩阵
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				mMatrix[i][j]=INF;
			}
		}
		
		int[] cTime=new int[n];//跟奶牛谈话的时间
		
		int min=0;
		int k=0;
		for(int i=0;i<n;i++){
			cTime[i]=in.nextInt();
			if(i==0)
				min=cTime[0];
			if(cTime[i]<min){
				k=i;
				min=cTime[i];
			}
		}
		
		//给每条边赋权值
		for(int i=0;i<p;i++){
			int a=in.nextInt()-1;
			int b=in.nextInt()-1;
			int c=in.nextInt();
			mMatrix[a][b]=c;
			mMatrix[b][a]=c;
		}
		
		prim(k,n,mMatrix,cTime);
	}
	
	
	/**
	 * 普里姆算法
	 * @param start 起点
	 * @param n 顶点数目
	 */
	static void prim(int start,int n,int[][] mMatrix,int[] cTime){
		int index=0;//最小树的索引
		int[] prims=new int[n];//普里姆最小树的结果数组
		int[] weigths=new int[n];//顶点间的权值
		int time=0;//安慰奶牛的时间
		
		prims[index++]=start;//先把起点放到结果数组中
		
		/**
		 * 除了最后一个牧场谈一次 其他牧场至少要谈两次
		 * 路要走两遍
		 */
		time=cTime[start]*2;

		//初始化顶点的权值数组 全部为起点到各顶点的权值
		for(int i=0;i<n;i++){
			weigths[i]=mMatrix[start][i];
		}
		
		//自身到自身的权值为零
		weigths[start]=0;
		
		for(int i=0;i<n;i++){
			
			//不用对起点进行处理
			if(i==start){
				continue;
			}
			
			int j=0;//计数器
			int k=0;//被选中的顶点
			int min=INF;
			
			while(j<n){
				//如果weigths[j]==0代表该点已加入
				if(weigths[j]!=0&&weigths[j]<min){
					min=weigths[j];
					k=j;
				}
				j++;
			}
			
			//更新时间
			if(index<n-1){
				time=time+cTime[k]*2;
			}else{
				time=time+cTime[k];
			}
			//将找到的顶点加入到结果数组
			prims[index++]=k;
			//更新权值
			weigths[k]=0;
		

			
			//当第k个顶点加入后更新其他顶点的权值
			for(int q=0;q<n;q++){
				if(weigths[q]!=0&&mMatrix[k][q]<weigths[q]){
					weigths[q]=mMatrix[k][q];
				}
			}
			
		
		}
		

	    // 计算最小生成树的权值
	    int sum = 0;
	    for (int i = 1; i < index; i++) {
	        int min = INF;
	        // 获取prims[i]在mMatrix中的位置
	        int n1 = prims[i];
	        // 在vexs[0...i]中，找出到j的权值最小的顶点。
	        for (int j = 0; j < i; j++) {
	            int m = prims[j];
	            if (mMatrix[m][n1]<min)
	                min = mMatrix[m][n1];
	        }
	        sum += min;
	    }
	    
	    System.out.println(2*sum+time);
	}
	
	
	
}
