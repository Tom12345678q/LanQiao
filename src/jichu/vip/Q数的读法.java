package jichu.vip;

import java.util.Scanner;
/*
 * 4个一组
 */
public class Q数的读法 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		String[] gewei={"ling ","yi ","er ","san ","si ","wu ","liu ","qi ","ba ","jiu "};
		String[] jinwei={"","shi ","bai ","qian ","wang ","yi "};
		
		
		String str=in.nextLine();
		char[] cs=str.toCharArray();
		int[] num=new int[cs.length];
		
		for(int i=cs.length-1;i>=0;i--){
			num[i]=Integer.parseInt(""+cs[i]);
		}
		
		String s="";
		
		int zuo=num.length/4;
		int yu=num.length%4;
		
		
		
		String[] fuzu=new String[zuo+(yu>0?1:0)];
		for(int i=0;i<zuo;i++){
			int k=3;//进位
			for(int j=0;j<4;j++){
				
				if(num[num.length-1-(i*4+j)]>0){
					s=s+gewei[num[num.length-1-(i*4+j)]]+jinwei[k--];
				}else{
					k--;
					s=s+gewei[0];
				}
			}
			fuzu[i]=s;
			s="";//重置
		}
		
		//处理余数
		int k=yu;
		for(int i=0;i<yu;i++){
			if(num[i]>0){
				s=s+gewei[num[i]]+jinwei[--k];
			}else{
				k--;
				s=s+gewei[0];
			}
		}
		fuzu[fuzu.length-1]=s;
		
		
		String str1="";
		for(int i=fuzu.length-1;i>=0;i--){
			str1=str1+fuzu[i];
		}
		System.out.println(str1);
		String[] sss=str1.split(" ");
		
		//设计一个状态码
		
		
	}

}
