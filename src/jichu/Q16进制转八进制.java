package jichu;

import java.util.Scanner;
/**
 * 　　输入的第一行为一个正整数n （1<=n<=10）。
　　接下来n行，每行一个由0~9、大
写字母A~F组成的字符串，表示要转换的十六进制正整数，每个十六进制数长度不超过100000
 * @author 丁赵雷
 *
 */
public class Q16进制转八进制 {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in); 
		


		int n=input.nextInt();
		String[] line=new String[n];
		
		
		for(int i=0;i<n;i++){
			line[i]=input.next();
		}
		
		for(int j=0;j<n;j++){
			String str=shiLiuTo2(line[j]);
			if(str.length()%3==1){
				str="00"+str;
			}
			if(str.length()%3==2){
				str="0"+str;
			}
			erTo8(str);
		}
		

		
		
		
	}

	
	public static String shiLiuTo2(String line){
		
		//16进制对应的2进制
		String[] index1={"0000","0001","0010","0011","0100","0101","0110",
				"0111","1000","1001","1010","1011","1100","1101","1110",
				"1111"};
		StringBuffer str=new StringBuffer();
		for(int i=0;i<line.length();i++){
			switch(line.charAt(i)){
			case '0' :str.append(index1[0]);break;
			case '1' :str.append(index1[1]);break;
			case '2' :str.append(index1[2]);break;
			case '3' :str.append(index1[3]);break;
			case '4' :str.append(index1[4]);break;
			case '5' :str.append(index1[5]);break;
			case '6' :str.append(index1[6]);break;
			case '7' :str.append(index1[7]);break;
			case '8' :str.append(index1[8]);break;
			case '9' :str.append(index1[9]);break;
			case 'A' :str.append(index1[10]);break;
			case 'B' :str.append(index1[11]);break;
			case 'C' :str.append(index1[12]);break;
			case 'D' :str.append(index1[13]);break;
			case 'E' :str.append(index1[14]);break;
			case 'F' :str.append(index1[15]);break;
			}
		}
		return str.toString();
	}
	
	public static void erTo8(String str){
		for(int i=0;i<str.length();i=i+3){
			int sum=Integer.parseInt(String.valueOf(str.charAt(i)))*4
					+Integer.parseInt(String.valueOf(str.charAt(i+1)))*2+
					Integer.parseInt(String.valueOf(str.charAt(i+2)))*1;
			if(sum!=0||i!=0){
				System.out.print(sum);
			}
			
		}
		System.out.println();
	}

}
