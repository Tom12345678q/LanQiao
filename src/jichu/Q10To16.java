package jichu;

import java.util.Scanner;
import java.util.Stack;

/**
 * 十六进制数是在程序设计时经常要使用到的
 * 一种整数的表示方式。它有0,1,2,3,4,5,6,
 * 7,8,9,A,B,C,D,E,F共16个符号
 * ，分别表示十进制数的0至15。十六进制的计数方法是满16进1，
 * 所以十进制数16在十六进制中是10，而十进制的17在十六进制中是11，
 * 以此类推，十进制的30在十六进制中是1E。
　　给出一个非负整数，将它表示成十六进制的形式。
 * @author 丁赵雷
 *
 */
public class Q10To16 {
	
	static Scanner io=new Scanner(System.in);
	static Stack<String> stack=new Stack<String>();
	public static void main(String[] args) {
		int i=io.nextInt();
		int j=0;
		int k=0;
		boolean flag=true;
		
		
		
		
		
		while(flag){
			j=i%16;
			pf(j);
			if(i<16){
				flag=false;
			}
			i=i/16;
		}
		
		
		while(!stack.empty()){
			System.out.print(stack.pop());
		}
		
		
	}
	
	
	public static void pf(int i){
		if(i==10){
			stack.push("A");
		}else if(i==11){
			stack.push("B");
		}else if(i==12){
			stack.push("C");
		}else if(i==13){
			stack.push("D");
		}else if(i==14){
			stack.push("E");
		}else if(i==15){
			stack.push("F");
		}else{
			String str=String.valueOf(i);
			stack.push(str);
		}
		
		
	}
	

}



