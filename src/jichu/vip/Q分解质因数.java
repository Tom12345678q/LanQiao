package jichu.vip;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Q分解质因数 {
	
	public static void main(String[] args) {
		
		long o1=new Date().getTime();
		Scanner in=new Scanner(System.in);
		int m=in.nextInt();
		int n=in.nextInt();
		List<Integer> prime=prime(n);
		
		//List<Integer> c=new ArrayList<Integer>();
		for(int i=m;i<=n;i++){
			
			int k=i;
			System.out.print(i+"=");
			for(int j=0;j<prime.size();){
				if(k%prime.get(j)==0){
					//c.add(prime.get(j));
					System.out.print(prime.get(j));
					if(k/prime.get(j)==1){
						break;
					}
					System.out.print("*");
					k=k/prime.get(j);
				}else{
					j++;
				}
			}
			
			System.out.println();
			//c.clear();
			
			/*System.out.print(i+"=");
			for(int g=0;g<c.size();g++){
				
				if(c.size()==1)
					System.out.print(i);
				else{
					System.out.print(c.get(g));
					if(g==c.size()-1)
						continue;
					System.out.print("*");
				}
			}
			System.out.println();
			c.clear();*/
		}
		
		long o2=new Date().getTime();
		System.out.println("耗时"+(o2-o1)+"毫秒");
		
	}
	
	
	static boolean isPrime(int n){
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0){
				return false;
			}
		}
		
		return true;
	}
	
	//快速求速数 区间 [m,n]约定[2,10000]
	static List<Integer> prime(int n){
		List<Integer> prime=new ArrayList<Integer>();
		for(int i=2;i<=n;i++){
			boolean flag=false;
			for(int j=2;j<=Math.sqrt(i);j++){
				if(i%j==0){
					flag=true;
					break;
				}
			}
			if(!flag){
				prime.add(i);
			}
		}
		return prime;
	}

}
