package jichu.vip;

import java.util.Scanner;

public class Q报时助手 {
	static String[] number={"zero","one", "two", "three", "four", "five",
			"six", "seven", "eight", "nine", "ten", "eleven", "twelve", 
			"thirteen", "fourteen", "fifteen", "sixteen", "seventeen","eighteen",
			"nineteen", "twenty"};
	static String[] big={"0 ","1 ","twenty","thirty","forty","fifty"};
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int h=in.nextInt();//小时
		int m=in.nextInt();//分钟
		
		if(m==0){
			System.out.println(number[h]+" o'clock");
		}else{
			String h1=jiexi(h);
			String m1=jiexi(m);
			System.out.println(h1+" "+m1);
		}
	}
	
	
	static String jiexi(int i){
		if(i<=20){
			return number[i];
		}else{
			
			if(i%10>0){
				return big[i/10]+" "+number[i%10];	
			}else{
				return big[i/10];
			}
		}
	}

}
