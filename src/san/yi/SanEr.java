package san.yi;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * 圆的面积 小数后7位四舍五入
 * @author 丁赵雷
 *
 */
public class SanEr {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int r=input.nextInt();
		double a= r*r*Math.PI;
		System.out.printf("%.7f",a);
/*		double r=input.nextDouble();
		double PI=Math.atan(1.0)*4;
		System.out.printf("%.7f", r*r*PI);*/

/*		int r=input.nextInt();
		double a= r*r*Math.PI;
		
		 BigDecimal bg = new BigDecimal(a).setScale(9, RoundingMode.UP);
		 String str=String.valueOf(bg);
		 System.out.println(str);
		 String[] strs=str.split("\\.");
		 System.out.println(strs.length);
		 String str2=strs[1];
		char c1=str2.charAt(8);
		char c=str2.charAt(7);
		
		
		if(c1<='4'){
			if(c<='4'){
				System.out.printf("%-100.7f",a);
			}
		}else{
			
			if(c<'9'){
				System.out.printf("%-100.7f",a);
			}else{
				BigDecimal bg1 = new BigDecimal(a).setScale(7, RoundingMode.UP);
				System.out.println(bg1);
			}
			

		}*/

		 
		 
		 

/*		String str=String.valueOf(a);
		String[] strs=str.split(".");
		String str2=strs[1];
		
		char c=str2.charAt(7);
		if(c<='4'){
			System.out.printf("%-100.7f",a);
		}else{
			char c1=str2.charAt(6);
			int index7=Integer.parseInt(String.valueOf(c1));
			if(index7==9){
				
			}
		}*/
	}
	
}
