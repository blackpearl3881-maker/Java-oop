package Labs;

public class Chronometer {

	int seconds;
	int minutes;
	int hours;
	int start;
	int stop;
	
	public Chronometer() {
		this.seconds=0;
		this.minutes=0;
		this.hours=0;
		}
	
	public void start() {
		start=(int)System.currentTimeMillis();
		System.out.println("Chronometer started!");
	}
	
	public void stop() {
		stop=(int)System.currentTimeMillis()-start;
		hours=stop/1000/3600;
		minutes=stop/1000/60;
		seconds=(stop/1000)%60;
		System.out.println("Chronometer ended at the time: "+ hours+":"+minutes+":"+seconds);
		this.hours=0;
		this.minutes=0;
		this.seconds=0;
	}
	public String getTime()
	{
		stop=(int)System.currentTimeMillis()-start;
		hours=stop/1000/3600;
		minutes=stop/1000/60;
		seconds=(stop/1000)%60;	
		return hours+":"+minutes+":"+seconds;
	}
	
	/*
	 * no need for the increment function
	 * 
	 * */
	
//	public void increment() {
//		
//		seconds++;
//		if(seconds==60) {
//			minutes++;
//			seconds=0;
//		}
//		if(minutes==60) {
//			hours++;
//			minutes=0;
//			seconds=0;
//		}
//		
//}
}
