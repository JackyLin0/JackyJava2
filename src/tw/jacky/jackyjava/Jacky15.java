package tw.jacky.jackyjava;

public class Jacky15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] p=new int[6];
		 for(int i=0;i<100;i++)
		 {
			 int point=(int)(Math.random()*6);
			 p[point]++;	
			 
		 }
		 for(int i=0;i<p.length;i++)
			 System.out.println((i+1)+":"+p[i]);
		 
		
	}

}
