public class main{
	public static void main(String[] args){
		//try and catch block to handle exceptions
		try {
		//declare new thread to count up
		upThread threadUp = new upThread();
		//start execution of thread
		threadUp.start();
		//delay the execution of thread
		threadUp.join();
		//declare new thread to count down
		downThread threadDown = new downThread();
		//start execution of thread
		threadDown.start();
		} catch(Exception e) {
			System.out.println("code Failed.");
		}
	}
}