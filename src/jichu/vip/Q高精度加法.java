package jichu.vip;

import java.util.Scanner;
/*
 * 大数相加 n<=100
 */
public class Q高精度加法 {
	static Scanner in=new Scanner(System.in);
	
	public static void main(String[] args) {
		String a=in.nextLine();
		String b=in.nextLine();
		char[] as=a.toCharArray();
		char[] bs=b.toCharArray();
		
		
		char[] max;
		char[] min;
		if(as.length>bs.length){
			max=as;
			min=bs;
		}else{
			max=bs;
			min=as;
		}
		int[] c=new int[max.length+1];
		in.close();
		
		boolean flag=true;
		int index=0;
		int temp=0;
		int jw=0;
		
		int maxLength=max.length;
		for(int i=min.length-1;i>=0;i--){
			maxLength--;
			temp=Integer.parseInt(String.valueOf(min[i]))+
					Integer.parseInt(String.valueOf(max[maxLength]))+jw;
			c[index]=temp%10;
			jw=temp/10;
			index++;
			
		}

		for(int j=max.length-min.length-1;j>=0;j--){
			temp=Integer.parseInt(String.valueOf(max[j]))+jw;
			
			
			c[index]=temp%10;
			jw=temp/10;
			index++;
		}
		
		int k=c.length-1;
		if(jw>0){
			c[c.length-1]=jw;
		}else{
			k--;
		}
		
		for(;k>=0;k--){
			System.out.print(c[k]);
		}

	}

}
