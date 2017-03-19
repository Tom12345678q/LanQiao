package jichu.vip;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Huffman树在编码中有着广泛的应用。在这里，我们只关心Huffman树的构造过程。
　给出一列数{pi}={p0, p1, …, pn-1}，用这列数构造Huffman树的过程如下：
　1. 找到{pi}中最小的两个数，设为pa和pb，将pa和pb从{pi}中删除掉，然后将它们的和加入到{pi}中。这个过程的费用记为pa + pb。
　2. 重复步骤1，直到{pi}中只剩下一个数。
　在上面的操作过程中，把所有的费用相加，就得到了构造Huffman树的总费用。
　本题任务：对于给定的一个数列，现在请你求出用该数列构造Huffman树的总费用。
 * @author 丁赵雷
 *
 */
public class Huffuman树 {
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		int n=in.nextInt();
		int[] huf=new int[n];
		for(int i=0;i<n;i++){
			huf[i]=in.nextInt();
		}
		
		in.close();
		
		int sum=0;
		for(int j=1;j<n;j++){
			Arrays.sort(huf);
			huf[j]=huf[j]+huf[j-1];
			sum=sum+huf[j];
		}

		System.out.println(sum);
	}

}
