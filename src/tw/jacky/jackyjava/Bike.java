package tw.jacky.jackyjava;

//類別 是用來定義的
public class Bike {
 // 裡面是你care的 東西
	//Field 
    private	double speed;
    
    //Constructor,沒傳回值，方法名稱與類別相同
    //剛出廠的狀態，只會被呼叫一次
    //錯誤觀念--->建立物件實體
    //在這邊時早就有物件實體
    Bike()
    {
    	System.out.println("Bike()");
    	
    }
    
    //Method
	void upSpeed() // 動詞｜介系詞小寫，名詞第一個字大寫
	{
		speed=(speed==0?1:speed*1.2);
 	}
	
	void downSpeen(){
		speed=(speed==0?1:speed*0.7); 		 
	}
	
	public String toString()
	{
		return null;
		
	}
	
	
	double getSpeed()
	{
		return speed;
	}
}
