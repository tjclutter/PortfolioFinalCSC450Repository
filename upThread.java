//declare new upThread class that inherits Thread class
class upThread extends Thread {
	//override run function
	public void run(){
		//use a for loop to count up to twenty
		for (int i = 1; i < 21; i++){
			//display numbers as it counts
			System.out.println(i);
		}
	}
}