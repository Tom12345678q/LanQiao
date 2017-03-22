package jichu.vip;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
/**
 * 最多到11
 * @author 丁赵雷
 *
 */
public class QFJ的字符串 {
	static String[] strs={"0","A","B","C","D","E","F","G","H","I","J","K",
			"L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n= in.nextInt();
		
		int k=0;
		for(int i=0;i<n;i++){
			k=k*2+1;
		}
		System.out.println(k);
		
		String path="D:/javaTest/java.txt";
		File file=new File(path);

		try {
			FileOutputStream fos=new FileOutputStream(file);
			fos.write(digui(n).getBytes());
			fos.flush();
			fos.close();
		} catch ( IOException e) {
			e.printStackTrace();
		}
		//System.out.println(digui(n));

	}
	
	
	//递归到11就崩了
	static String digui(int n){
		if(n==1){
			return strs[n];
		}else{
			return digui(n-1)+strs[n]+digui(n-1);
		}
	}

}
