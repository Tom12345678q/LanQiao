package q算法训练;

import java.util.Scanner;

/**
 * 用邻接表来创建图
 * @author 丁赵雷
 *
 */

//这个得60分 一个错误三个超时
public class Q最短路邻接表 {
	
	
	/**
	 * 声明静态内部类
	 * @author 丁赵雷
	 *
	 */
	
	//对应c的表示 链表的顶点的结构体
	static class ENode{
		int ivex;//顶点的位置
		int weight;//权值
		ENode nextEdge;//指向下一个顶点的指针
	}
	
	//顶点
	static class VNode{
		//int data;保存顶点的信息暂时用不到
		ENode firstEdge;//指向与自己相连的第一个顶点
	}
	
	
	static final int INF=Integer.MAX_VALUE;
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		VNode[] mVexs;//顶点数组
		int n=in.nextInt();//顶点数
		int m=in.nextInt();//边数
		
		mVexs=new VNode[n];
		
		//初始化顶点
		for(int i=0;i<n;i++){
			mVexs[i]=new VNode();
			mVexs[i].firstEdge=null;
		}
		
		//初始化邻接表
		for(int i=0;i<m;i++){
			int v1=in.nextInt()-1;
			int v2=in.nextInt()-1;
			int weight=in.nextInt();
			ENode e=new ENode();
			e.ivex=v2;
			e.weight=weight;
			
			if(mVexs[v1].firstEdge==null){
				mVexs[v1].firstEdge=e;
			}else{
				//头插法
/*				e.nextEdge=mVexs[v1].firstEdge;
				mVexs[v1].firstEdge=e;*/
				
				//尾插法
				ENode s=mVexs[v1].firstEdge;
				while(s.nextEdge!=null){
					s=s.nextEdge;
				}
				s.nextEdge=e;
			}
		}
		
		
		
		/**
		 * 下面开始迪杰斯特拉算法
		 */
		int start=0;//起始点
		boolean[] flag=new boolean[n];//flag[i]=true表示起始点到i的最短路径已成功获取
		int[] prev=new int[n];//起始点到i点之前的那个顶点  前驱顶点数组
		int[] dist=new int[n];// 顶点到i点的长度  也是权

		for (int i=0 ; i<n ; i++) {
			dist[i]=INF;
			flag[i]=false;
			prev[i]=0;
		}

		ENode eNode=mVexs[start].firstEdge;
		while(eNode!=null){
			dist[eNode.ivex]=eNode.weight;
			eNode=eNode.nextEdge;
		}
		
		//对起始点初始化
		flag[start]=true;
		dist[start]=0;
		
		//遍历 n次每次找出一个点
		int k=0;//保存找到的顶点
		for(int i=0; i<n;i++){
			
			int min=INF;
			for(int j=0;j<n;j++){
				if(!flag[j]&&dist[j]<INF){
					min=dist[j];
					k=j;
				}
			}
			
			flag[k]=true;
			
			//更新当前路径 就是起始点到k+k到与他距离最短的顶点
			ENode e=mVexs[k].firstEdge;
			while(e!=null){
				int temp=e.weight==INF?INF:e.weight+min;
				if(!flag[e.ivex]&&temp<dist[e.ivex]){
					dist[e.ivex]=temp;
				}
				e=e.nextEdge;
			}
			
		}
		
		for(int i=1;i<n;i++){
			System.out.println(dist[i]);
		}

	}

	
	

}
