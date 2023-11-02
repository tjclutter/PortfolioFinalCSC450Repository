
public class main{
	public static void main(String[] args){
		upThread threadUp = new upThread();
		threadUp.start();
		downThread threadDown = new downThread();
		threadDown.start();
	}
}