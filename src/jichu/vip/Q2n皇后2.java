package jichu.vip;

import java.util.Scanner;
public class Q2n皇后2 {
    static int j=0,n,count=0;  
    static int map[][];  
    
    public static void main(String args[])  
    {  
        Scanner cn=new Scanner(System.in);  
        n=cn.nextInt();  
        map=new int[n][n];  
        for(int i=0;i<n;i++)  
            for(int j=0;j<n;j++)  
                map[i][j]=cn.nextInt();  
        Put(0,2);   //假设黑皇后为2 白皇后为3  放了皇后的地方就用2，3表示  ，0表示第0行
        System.out.println(count);  
    }
    /**
     * 
     * @param t 开始放的下标
     * @param s 皇后的类型
     */
    public static void Put(int t,int s)  {  
        //放完某种类型的皇后了
        if(t==n)  {  
            if(s==2)
            	Put(0,3);  //表示之前放的是黑皇后，现在开始放白皇后
            else 
            	count++;  //因为这会第n个已经放完了，所以方法数量加1
            return ;  //此时白皇后也放完了 ，就返回
        }  
        for(int i=0;i<n;i++)  {  
              
            if(map[t][i]!=1)
            	continue; //此处已被不能放皇后或放过皇后则跳出本次循环 
            if(Check(t,i,s))
            	map[t][i]=s; //当前遍历后发现位置合适，就把皇后放当前位置
            else 
            	continue;  //不合适跳过本次循环，查找当前行下一个位置
            Put(t+1,s); //此位置放完一个皇后还要去放下一个皇后 
           // System.out.println("t="+t+" i="+i+"   map[t][i]="+map[t][i]+"  j="+j++);
            
            
            /**
             * 因为在放完白皇后，又要放黑皇后，所以得把以前 改变的值恢复原样
             */
            map[t][i]=1;   //回溯法的关键，假设这个位置不放皇后，把皇后放在别的位置   
        }  
        return ;  
    }  
    /**
     * 
     * @param t 当前行
     * @param i 当前列
     * @param s 皇后的类型
     * @return
     */
    public static boolean Check(int t,int i,int s)  
    {  
        for(int q=t-1;q>=0;q--)  
        {  
            //当前列上有同类皇后，就返回false
            if(map[q][i]==s)return false;  
        }         
        for(int q=t-1,w=i-1;q>=0&&w>=0;q--,w--)
        {  
            //检查主对角线向上方向（前几行）是否处于同类皇后在对角线上
            if(map[q][w]==s)return false;  
        }  
        for(int q=t-1,w=i+1;q>=0&&w<=n-1;q--,w++)  
        {  
            //检查副对角线向上方向（前几行）是否处于同类皇后在对角线上
            if(map[q][w]==s)return false;  
        }  
        return true;  
    }  
}
