package q算法分类.q动态规划;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
/**
 * 邻接表实现
 * @author 丁赵雷
 *
 */
public class Q图深度and广度优先搜索 {
	
	//边
	static class ArcNode{
		ArcNode nextArc;//下一条边
		int vex;//边所指的顶点
		int weight;//权值
	}
	
	//顶点
	static class VNode{
		ArcNode fristArc;//该顶点所指的第一条边
	}
	
	static VNode[] vNode;//顶点数组
	static boolean[] visited;//表示这个顶点是否被访问
	
	public static void main(String[] args) throws IOException {
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
	
		String[] str=bfr.readLine().split(" ");
		 

		int n=Integer.parseInt(str[0]);//顶点数
		int m=Integer.parseInt(str[1]);//边数
		
		vNode=new VNode[n];
		visited=new boolean[n];
		for(int i=0;i<n;i++){
			visited[i]=false;
			vNode[i]=new VNode();
		}
		//初始化邻接表
		for(int i=0;i<m;i++){
			str=bfr.readLine().split(" ");
			ArcNode arc=new ArcNode();
			arc.vex=Integer.parseInt(str[1]);
			int v=Integer.parseInt(str[0]);
			
			if(vNode[v].fristArc==null){
				vNode[v].fristArc=arc;
			}else{
				//前插法
				arc.nextArc=vNode[v].fristArc;
				vNode[v].fristArc=arc;
			}
		}
		
		//DFS(0,vNode[0].fristArc);
		BFS(0);
	}
	
	
	/**
	 * 深度优先遍历 连通图	
	 * @param v 起始点
	 */
	static void DFS(int v,ArcNode arc){
		System.out.print(v+" ");
		
		visited[v]=true;
		arc=vNode[v].fristArc;
		
		while(arc!=null){
			if(!visited[arc.vex]){//如果没有被访问过就继续便利
				DFS(arc.vex,arc);
			}else{//如果访问过就去下一个节点
				arc=arc.nextArc;				
			}
		}
	}
	
	/**
	 * 连通图 非递归
	 * @param v 起始点 
	 */
	static void BFS(int v){
		System.out.print(v+" ");
		Queue<Integer> queue=new LinkedList<Integer>();
		queue.add(v);//入队
		visited[v]=true;
		
		while(!queue.isEmpty()){
			int u=queue.poll();//出队
			
			ArcNode arc=vNode[u].fristArc;
			while(arc!=null){
				if(!visited[arc.vex]){
					System.out.print(arc.vex+" ");
					visited[arc.vex]=true;
					queue.add(arc.vex);
					arc=arc.nextArc;
				}else{
					arc=arc.nextArc;
				}
			}
		}
	}

}
