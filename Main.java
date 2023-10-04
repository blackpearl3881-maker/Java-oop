package Labs;

public class Main {

	public static void main(String[] args) throws Exception {

//		Car c= new Car(248, "BMW","Black");
//		Car c1= new Car(140,"Mercedes","Grey");
//		c.print();
//		c1.print();
		Chronometer c= new Chronometer();
		
		c.start();
//		for(int i=1; i<90000; i++) {		
//			c.increment();}

			Thread.sleep(90000);
		System.out.println(c.getTime());
		c.stop();
	}
}