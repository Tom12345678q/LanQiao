package jichu.vip;

import java.util.Arrays;
import java.util.Scanner;

public class Q矩形面积交 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		double[] a1=new double[4];
		double[] b1=new double[4];
		
		for(int i=0;i<4;i++){
			a1[i]=in.nextDouble();	
		}
		for(int i=0;i<4;i++){
			b1[i]=in.nextDouble();	
		}
		

		double aL=Math.abs(a1[0]-a1[2]);//长
		double aH=Math.abs(a1[1]-a1[3]);//高
		double bL=Math.abs(b1[0]-b1[2]);
		double bH=Math.abs(b1[1]-b1[3]);
		
		//再计算出他们的中心坐标
		double aX=(a1[0]+a1[2])/2;
		double aY=(a1[1]+a1[3])/2;
		double bX=(b1[0]+b1[2])/2;
		double bY=(b1[1]+b1[3])/2;

		//两个矩阵在一块 有三种情况 相交 相离 包含
		if((Math.abs(aX-bX)>(aL+bL)/2)&&(Math.abs(aY-bY)>(aH+bH)/2)){//判断是否相离
			System.out.println("相离");
			System.out.println("0.00");
			return;
		}
		if((Math.abs(aX-bX)<Math.abs(aL-bL)/2)&&(Math.abs(aY-bY)<Math.abs(aH-bH)/2)){//判断是否包含
			double s=aL*aH>bL*bH?bL*bH:aL*aH;
			System.out.println("包含");
			System.out.printf("%.2f",s);
			return;
		}
		
		//相交
		double[] x={a1[0],a1[2],b1[0],b1[2]};
		double[] y={a1[1],a1[3],b1[1],b1[3]};
		Arrays.sort(x);
		Arrays.sort(y);
		double n=(y[2]-y[1])*(x[2]-x[1]);
		System.out.printf("%.2f",n);
		
	}


}
