package jichu.vip;

import java.util.Scanner;

public class Q完美的代价 {
	static int change=0;//改变的次数
	static int old=0;//记录出现奇数次字符的次数
	static char charold=0;//记录奇数字符
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=Integer.parseInt(in.nextLine());
		String s=in.nextLine();
		char[] str=s.toCharArray();
		
		boolean flag=check(str);
		
		if(!flag){
			System.out.println("Impossible");
		}else{
			//分成两部分从后向前找
			for(int i=0;i<n/2;i++){//i代表当前需要被比对的字符的位置
				if(str[i]!=charold){
					int j=0;
					for(j=n-1-i;j>i;j--){
						if(str[i]==str[j]){
							break;//找到跟他一样的了
						}
					}
					change=change+n-1-i-j;
					
					//移动字符串
					for(int k=j;k<n-1-i;k++){
						str[k]=str[k+1];//往后挪
					}
					str[n-i-1]=str[i];//用对称点赋值，就不用再特地去保存所找到的那个值
				}else{
					int j=0;
					for(j=i;j<n-i-1;j++){
						if(str[j]==str[n-i-1]){
							break;
						}
					}
					change=change+j-i;
					for(int k=j;k>i;k--){
						str[k]=str[k-1];
					}
					str[i]=str[n-i-1];
				}
			}
			System.out.println(change);
		}
		
	}
	
	
	
	//检查该字符串是否可以变成回文
	static boolean check(char[] str){
		int arr[] =new int[26];//记录26个字母出现的次数
		
		for(int i=0;i<str.length;i++){
			arr[str[i]-'a']++;
		}
		
		for(int i=0;i<26;i++){
			if(arr[i]%2==1){
				old++;
				charold=(char) ('a'+i);//如果有出现奇数次的字符就记录下来 他是谁
			}
		}
		
		//出现奇数次的字符最多只能有一个
		if(old>1){
			return false;
		}
		return true;
	}

}
