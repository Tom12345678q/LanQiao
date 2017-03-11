package jichu;
/**
 * 对于长度为5位的一个01串，每一位都可能是0或1，一共有32种可能。它们的前几个是：
00000
00001
00010
00011
00100
请按从小到大的顺序输出这32种01串。
 * @author 丁赵雷
 *
 */
public class Q01串 {
	public static void main(String[] args) {
		int[] num={0,0,0,0,0};
		
		boolean flag=true;
		int k=0;
		
		for(int i=0;i<32;i++){
			int index=5;
			k=i;
			while(flag){
		
				num[--index]=k%2;
				if(k/2==0){
					break;
				}
				k=k/2;
			}
			for(int q=0;q<5;q++){
				System.out.print(num[q]);
			}
			System.out.println();
		}
	}
	

}
