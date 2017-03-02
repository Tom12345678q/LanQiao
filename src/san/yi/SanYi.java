package san.yi;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Fibonacci数列的递推公式为：Fn=Fn-1+Fn-2，其中F1=F2=1。
当n比较大时，Fn也非常大，现在我们想知道，Fn除以10007的余数是多少。
 * @author 丁赵雷
 *
 */
public class SanYi {
	
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
/*		for(int i=1;i<200;i++){
			//System.out.printf("%-5.0f",Fibonacci(i)%10007);
			BigInteger f=Fibonacci1(i);
			BigInteger d=new BigInteger("10007");
			BigInteger c=f.mod(d);
			System.out.printf("i=%d f=%1d  c=%1d ",i,f,c);
			if(i%3==0){
				System.out.println();
			}
		}*/
		int n=input.nextInt();
		
		System.out.printf("%d",f(n));
		//System.out.printf("%d",Fibonacci1(n));
	//	System.out.printf("%-5.0f",Fibonacci(n)%10007);
		//int n=input.nextInt();
	
	}
	
	//递归实现 优点：简单明了，缺点：当n较大时容易出现栈溢出
	public static double Fibonacci(int n){
		if(n==1||n==2){
			return 1;
		}else{
			return Fibonacci(n-1)+Fibonacci(n-2);
		}
	}
	
	
	//递推实现方式  用BigInteger
	public static BigInteger Fibonacci1(int n){
		BigInteger[] f=new BigInteger[n];
		BigInteger a=BigInteger.ONE;
		BigInteger d=new BigInteger("10007");
		
		if(n<3){
			
			return a;
		}else{
			
			f[0]=a;
			f[1]=a;
			for(int i=2;i<n;i++){
				f[i]=(f[i-1].add(f[i-2])).mod(d);
			}
		}
		return f[n-1];
	}
	
	//也可以不用BigInteger
	public static int f(int n){
		int[] f1=new int[n];
		
		if (n<3){
			return 1;
		}else{
			f1[0]=1;
			f1[1]=1;
			for(int i=2;i<n;i++){
				f1[i]=(f1[i-1]+f1[i-2])%10007;
			}
			
		}
		return f1[n-1];
	}


}
