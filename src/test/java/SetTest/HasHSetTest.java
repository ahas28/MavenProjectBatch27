package SetTest;

import java.util.HashSet;
import java.util.Set;

public class HasHSetTest {
	//set is interface which can implement many classes
	//such as hashSet,treeSet,LinkedHashSet
	//set can handle the only unique values and one null values
	//set is not sync

	
	public static void main(String[] args) {
		Set<String>cars = new HashSet<String>();
		cars.add("Honda");
		cars.add("Honda");
		cars.add("Lexus");
		cars.add(null);
		cars.add(null);
		
		for(String newCars: cars) {
			System.out.println(newCars);
		}
		
		
		
		
	}
}
