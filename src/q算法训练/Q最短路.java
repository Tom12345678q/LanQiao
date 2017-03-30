package q算法训练;

import java.util.Scanner;
/**
 * 用邻接矩阵 超时 准备用邻接表
 * @author 丁赵雷
 *
 */
public class Q最短路 {
	 // private int mEdgNum;        // 边的数量
    static char[] mVexs;       // 顶点集合
    static int[][] mMatrix;    // 邻接矩阵
    static final int INF = Integer.MAX_VALUE;   // 最大值
    
    
    
    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();//顶点数
		int m=in.nextInt();
    	//首先把邻接矩阵初始化
    	mMatrix=new int[n][n];
    	
    	for(int i=0;i<n;i++){
    		for(int j=0;j<n;j++){
    			mMatrix[i][j]=INF;//代表i j这两个顶点没边
    		}
    	}
    	for(int i=0;i<m;i++){
    		mMatrix[in.nextInt()-1][in.nextInt()-1]=in.nextInt();
    	}
    	
    	//初始化顶点数组
    	mVexs=new char[n];

    	
    	
    	
    	int[] prev=new int[n];
    	int[] dist=new int[n];
    	
    	dijkstra(0, prev, dist);
    	
	}
    
    
    /*
     * Dijkstra最短路径。
     * 即，统计图中"顶点vs"到其它各个顶点的最短路径。
     *
     * 参数说明：
     *       vs -- 起始顶点(start vertex)。即计算"顶点vs"到其它顶点的最短路径。
     *     prev -- 前驱顶点数组。即，prev[i]的值是"顶点vs"到"顶点i"
     *     		   的最短路径所经历的全部顶点中，位于"顶点i"之前的那个顶点。
     *     		   这个暂时没用到
     *     dist -- 长度数组。即，dist[i]是"顶点vs"到"顶点i"的最短路径的长度。
     */
    public static void dijkstra(int vs, int[] prev, int[] dist) {
        // flag[i]=true表示"顶点vs"到"顶点i"的最短路径已成功获取
        boolean[] flag = new boolean[mVexs.length];

        // 初始化
        for (int i = 0; i < mVexs.length; i++) {
            flag[i] = false;          // 顶点i的最短路径还没获取到。
           // prev[i] = 0;              // 顶点i的前驱顶点为0。
            dist[i] = mMatrix[vs][i];  // 顶点i的最短路径为"顶点vs"到"顶点i"的权。
        }

        // 对"顶点vs"自身进行初始化
        flag[vs] = true;
        dist[vs] = 0;

        // 遍历mVexs.length-1次；每次找出一个顶点的最短路径。
        int k=0;
        for (int i = 0; i < mVexs.length; i++) {
            // 寻找当前最小的路径；
            // 即，在未获取最短路径的顶点中，找到离vs最近的顶点(k)。
            int min = INF;
            for (int j = 0; j < mVexs.length; j++) {
                if (flag[j]==false && dist[j]<min) {
                    min = dist[j];//这里的min代表起始点到j顶点的权值
                    k = j;
                }
            }
            // 标记"顶点k"为已经获取到最短路径
            flag[k] = true;

            // 修正当前最短路径和前驱顶点
            // 即，当已经"顶点k的最短路径"之后，更新"未获取最短路径的顶点的最短路径和前驱顶点"。
            for (int j = 0; j < mVexs.length; j++) {
                int tmp = (mMatrix[k][j]==INF ? INF : (min + mMatrix[k][j]));
                if (flag[j]==false && (tmp<dist[j]) ) {
                    dist[j] = tmp;
                  //  prev[j] = k;
                }
            }
        }

        // 打印dijkstra最短路径的结果
        for (int i=1; i < mVexs.length; i++){
        	System.out.println(dist[i]);
        }
            
    } 
}
