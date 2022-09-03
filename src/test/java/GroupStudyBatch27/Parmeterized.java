package GroupStudyBatch27;

public class Parmeterized { // allows you up update methods compared to standard method which makes code more simpler.
	
	public static void main(String[] args) {
		Parmeterized.add(15,9,9);
		System.out.println(Parmeterized.minus(15,9));
		System.out.println(Parmeterized.minus(20,80));
		System.out.println(Parmeterized.minus(280,890));
		System.out.println(Parmeterized.add(5,5,5));
		System.out.println(Parmeterized.divide(280,890));
		System.out.println(Parmeterized.divide(280,28));
	}
	
	public static int minus(int y, int z) {
		return (y-z);
		
	}
	
	public static int add(int x, int y, int z ) {
		return (x+y-z);
		
	}
	
	public static int divide(int y, int z) {
		return (y/z);
	}
	
	class test{
		
	
	}
}
