package jichu;

import java.util.Scanner;

/**
 * 从键盘输入一个不超过8位的正的十六进制数字符串，将它转换为正的十进制数后输出。
　　注：十六进制数中的10~15分别用大写的英文字母A、B、C、D、E、F表示。
 * @author 丁赵雷
 *
 */
public class Q16转10 {
	static Scanner sysio=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String str=sysio.nextLine();
		char[] cs=str.toCharArray();
		
		long sum=0;
		int count=-1;
		for(int i=cs.length-1;i>=0;i--){
/*			if(cs[i]=='1'){
				sum=(long) (sum+Math.pow(16, ++count));
				continue;
			}
			if(cs[i]=='2'){
				sum=(long) (sum+2*Math.pow(16, ++count));
				continue;
			}
			if(cs[i]=='3'){
				sum=(long) (sum+3*Math.pow(16, ++count));
				continue;
			}
			if(cs[i]=='4'){
				sum=(long) (sum+4*Math.pow(16, ++count));
				continue;
			}
			if(cs[i]=='5'){
				sum=(long) (sum+5*Math.pow(16, ++count));
				continue;
			}
			if(cs[i]=='6'){
				sum=(long) (sum+6*Math.pow(16, ++count));
				continue;
			}
			if(cs[i]=='7'){
				sum=(long) (sum+7*Math.pow(16, ++count));
				continue;
			}
			if(cs[i]=='8'){
				sum=(long) (sum+8*Math.pow(16, ++count));
				continue;
			}
			if(cs[i]=='9'){
				sum=(long) (sum+9*Math.pow(16, ++count));
				continue;
			}*/
			if(cs[i]=='A'){
				sum=(long) (sum+10*Math.pow(16, ++count));
				continue;
			}
			if(cs[i]=='B'){
				sum=(long) (sum+11*Math.pow(16, ++count));
				continue;
			}
			if(cs[i]=='C'){
				sum=(long) (sum+12*Math.pow(16, ++count));
				continue;
			}
			if(cs[i]=='D'){
				sum=(long) (sum+13*Math.pow(16, ++count));
				continue;
			}
			if(cs[i]=='E'){
				sum=(long) (sum+14*Math.pow(16, ++count));
				continue;
			}
			if(cs[i]=='F'){
				sum=(long) (sum+15*Math.pow(16, ++count));
				continue;
			}
			
			int j=Integer.parseInt(String.valueOf(cs[i]));
			sum=(long) (sum+j*Math.pow(16, ++count));
			
			
		}
		
		System.out.println(sum);
		
	}
}
