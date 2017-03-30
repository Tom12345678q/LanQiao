package q算法训练;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/**
 * @version 1.1
 * @author 丁赵雷
 *
 */
public class Q表达式计算 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		//优先级 1> -1< 0=  2代表语法错误
		int[][] youxian={
				{1,1,-1,-1,-1,1,1},
				{1,1,-1,-1,-1,1,1},
				{1,1,1,1,-1,1,1},
				{1,1,1,1,-1,1,1},
				{-1,-1,-1,-1,-1,0,2},
				{1,1,1,1,2,1,1},
				{-1,-1,-1,-1,-1,2,0}
		};
		
		Map<String,Integer> m=new HashMap<String,Integer>();
		m.put("+", 0);
		m.put("-", 1);
		m.put("*", 2);
		m.put("/", 3);
		m.put("(", 4);
		m.put(")", 5);
		m.put("#", 6);
		
		Stack<String> number=new Stack<String>();//储存数字
		Stack<String> op=new Stack<String>();//储存运算符
		
		op.push("#");//将表达式起始运算符压入栈中
		String str="";
		String s=in.nextLine();
		/**
		 * 这一步很重要  还可以防止第48行越界
		 */
		s=s+"#";//拼接一个表达式结束运算符
		
		
		int i=0;
		int k=0;	
			while(s.charAt(i)!='#'||!op.peek().equals("#")){
				if(isNum(s.charAt(i))){
					str=str+s.charAt(i);
					if(!isNum(s.charAt(i+1))){
						number.push(str);
						str="";
					}

				}else{
					k=youxian[m.get(op.peek())][m.get(s.charAt(i)+"")];//扫描进入的符号好栈顶的符号比
					switch (k) {
					case -1:
						op.push(s.charAt(i)+"");
						break;
					case 0:
						op.pop();
						break;
					case 1:
						int o=yunSuan(number.pop(),number.pop(),op.pop());
						number.push(String.valueOf(o));
						break;
					}
				}
				if(k!=1&&i<s.length()-1)
					i++;
			}
		
		System.out.println(number.pop());
	}
	
	
	
	//进行运算
	static int yunSuan(String num1,String num2,String op){
		int i=Integer.parseInt(num2);
		int j=Integer.parseInt(num1);
		
		int k=0;
		switch (op.charAt(0)) {
		case '+':
			return k=i+j;
		case '-':
			return k=i-j;
		case '*':
			return k=i*j;
		case '/':
			return k=i/j;
		}
		return k;
	}
	
	//判断是否是数字
	static boolean isNum(char c){
		switch (c) {
		case '+':
			return false;
		case '-':
			return false;
		case '*':
			return false;
		case '/':
			return false;
		case '(':
			return false;
		case ')':
			return false;
		case '#':
			return false;
		}
		return true;
	}
}
