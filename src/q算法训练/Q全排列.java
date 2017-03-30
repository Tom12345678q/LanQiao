package q算法训练;

import java.util.Scanner;

public class Q全排列 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		String s=in.nextLine();
		
		p(0,s.toCharArray());
	}
	
	
	
	static void p(int k,char[] c){
		if(k==c.length){
			for(int i=0;i<c.length;i++){
				System.out.print(c[i]);
			}
			System.out.println();
		}
		
		for(int i=k;i<c.length;i++){
			char m=c[k];
			c[k]=c[i];
			c[i]=m;
			p(k+1,c);
			char n=c[i];
			c[i]=c[k];
			c[k]=n;
		}
	}

}
