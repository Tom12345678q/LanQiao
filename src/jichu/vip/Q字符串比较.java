package jichu.vip;

import java.util.Scanner;

public class Q字符串比较 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		String a=in.next();
		String b=in.next();
		
		if(a.length()!=b.length()){
			System.out.println(1);
		}else{
			if(!a.toLowerCase().equals(b.toLowerCase())){
				System.out.println(4);
			}else{
				if(!a.equals(b)){
					System.out.println(3);
				}else{
					System.out.println(2);
				}
			}
		}
	}

}
