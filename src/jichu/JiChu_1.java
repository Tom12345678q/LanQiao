package jichu;

import java.util.Arrays;
import java.util.Scanner;


/**
 * 给定一个长度为n的数列，将这个数列按从小到大的顺序排列。1<=n<=200
 * @author 丁赵雷
 *
 */
public class JiChu_1 {
	public static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		int n, a[]; 
		while(sc.hasNextInt()){ 
			n = sc.nextInt(); 
			a = new int[n]; 
			for(int i=0; i<n; i++) 
				a[i] = sc.nextInt(); 
			Arrays.sort(a); 
			for(int i=0; i<n; i++) 
				System.out.print(a[i] + " "); 
			System.out.println(); 
		} 
		

	}
	
	
	//我自己写的  只得85分  跟答案输出的结果一样
	public static void w(){
		int n=input.nextInt();
		int i=0, j=0;
		int[] numbers=new int[n+1];
		
		int a=input.nextInt();
		String str=input.nextLine();
		
		String[] strs=str.split(" ");
		
		
		
		for(i=1;i<strs.length+1;i++){
			if(i==1){
				numbers[1]=a;
			}else{
				int s=Integer.parseInt(strs[i-1]);
				numbers[i]=s;				
			}
		}
		
		//直接插入排序  数列比较小
		
		for(i=2;i<numbers.length;i++){
			if(numbers[i]<numbers[i-1]){
				numbers[0]=numbers[i];
				numbers[i]=numbers[i-1];
				
				for(j=i-2;numbers[0]<numbers[j];j--){
					numbers[j+1]=numbers[j];
				}
				numbers[j+1]=numbers[0];
			}
		}
		
		for(int j1=1;j1<numbers.length;j1++){
			System.out.print(numbers[j1]+" ");
		}
	}
	
	
	//网上的方法
	public static void xinLei(){
		Scanner sc = new Scanner(System.in); 
		int n, a[]; 
		while(sc.hasNextInt()){ 
			n = sc.nextInt(); 
			a = new int[n]; 
			for(int i=0; i<n; i++) 
				a[i] = sc.nextInt(); 
			Arrays.sort(a); 
			for(int i=0; i<n; i++) 
				System.out.print(a[i] + " "); 
			System.out.println(); 
		} 
	}

}
