
public class Test {
	int count=0;
	
	public static void main(String[] args) {
/*		Test t=new Test();
		
		t.p(0);*/
		
		System.out.println(-8>>>2);
		System.out.println(8>>2);
		System.out.println(8<<2);
	}
	
	void p(int cur){
		if(cur==5){
			return;
		}else{
			p(cur+1);
			System.out.println("count= "+count++);
		}
	}

}


