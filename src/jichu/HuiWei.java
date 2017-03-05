package jichu;

import java.util.Scanner;

/**
 * 123321是一个非常特殊的数，它从左边读和从右边读是一样的。
　　输入一个正整数n， 编程求所有这样的五位和六位十进制数，满足各
位数字之和等于n 。
 * @author 丁赵雷
 *
 */
public class HuiWei {
	static Scanner io=new Scanner(System.in);
	public static void main(String[] args) {
		int n=io.nextInt();
		for(int i=10000;i<999999;i++){
			String str=String.valueOf(i);
			StringBuffer sb=new StringBuffer(str);
			String str1=String.valueOf(sb.reverse());
			if(str.equals(str1)){
				int sum=0;
				for(int j=0;j<str.length();j++){
					sum=sum+Integer.parseInt(""+str.charAt(j));
				}
				if(sum==n){
					System.out.println(str);
				}
			}
		}
	}
}
