import java.util.Random;

public class Driver {

	static Random r = new Random(); 
	
	public static void main(String[] args) {
		
		//Any valid int
		int x = r.nextInt();
		System.out.println(x);
		
		//int between 0-8 inclusively 
		int y = r.nextInt(9);
		System.out.println(y);
		
		//a double between 0-5
		double z = (r.nextDouble()*5);
		System.out.println(z);
		
		//returns a float between 0 and 10, then rounds to the nearest int
		int a = Math.round(r.nextFloat()*10);
		System.out.println(a);
		
		
	}

}
