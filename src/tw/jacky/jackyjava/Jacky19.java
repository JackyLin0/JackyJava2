package tw.jacky.jackyjava;

public class Jacky19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] p=new int[10];
		
		for(int i=0;i<=100;i++)
		{
			int point= (int)(Math.random()*10);
			p[point]++; 
	 	}
			p[3]=p[3]+p[6];
			p[4]=p[4]+p[7];
			p[5]=p[5]+p[8];
		
		for(int i=0;i<p.length;i++)
		{
			if(i<6){
			System.out.println((i+1)+":"+p[i]);}
		}
		
		
		
	}

}
