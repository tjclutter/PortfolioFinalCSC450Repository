//declare downThread class that inherits from Thread
class downThread extends Thread {
	//override run function
	public void run(){
		//use for loop to count down to zero
		for (int i = 20; i >= 0; i--){
			//display numbers as thread counts down
			System.out.println(i);
		}
	}
}