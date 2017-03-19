package jichu.vip;

import java.util.Scanner;

public class Q龟兔赛跑预测 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int v1;//兔子的速度
		int v2;//乌龟的速度
		int t;//兔子超过乌龟t米后开始休息
		int s;//休息s秒
		int l;//总路程
		
		int tuS=0;//兔子跑的的路程
		int wuS=0;//乌龟跑的路程
		int count=0;//计算休息的秒数
		boolean flag=false;//是否休息的开关
		
		v1=in.nextInt();
		v2=in.nextInt();
		t=in.nextInt();
		s=in.nextInt();
		l=in.nextInt();
		
		for(int i=1;i<=l/v2+1;i++){
			if(i>1){
				
				//判断胜负
				if(tuS>=l&&wuS>=l){
					System.out.println("D");//并列第一
					System.out.println(i-1);
					break;
				}
				
				if(tuS>=l){
					System.out.println("R");//兔子获胜
					System.out.println(i-1);
					break;
				}
				if(wuS>=l){
					System.out.println("T");//乌龟获胜
					System.out.println(i-1);
					break;
				}
				
				
				
				
				if(tuS-wuS>=t){
					flag=true;
				}
				if(flag&&++count>s){//flag是为不执行++count
					flag=false;
					count=0;//初始化
				}
				if(!flag){
					tuS=tuS+v1;
				}
				
				wuS=wuS+v2;
				continue;
			}else{
				wuS=wuS+v2;
				tuS=tuS+v1;
			}
		}
		
	}

}
