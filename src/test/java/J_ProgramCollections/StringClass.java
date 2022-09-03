package J_ProgramCollections;

public class StringClass {
	
	static String name;
	
	public static void main(String[] args) {
		//why string is immutable
		
		name = "hash";//This value store in hip memory
		
		name = "hashem";//String pool
		
		name = "Abul";
		
		//which string is mutable class?
		//Ans: StringBuffer & String Builder
		
		//what is the difference StringBuffer & string Builder
		//Stringbuilder is not synchronized
		//stringbuilder is not thread safe
		String name = " Hash ";
		StringBuffer obj = new StringBuffer(" Abulhashem ");
		//obj.reverse();
		System.out.println(obj.append(name));
		
		String s1 = " Honda ";
		String s2 = " Honda ";
		
		System.out.println(s1 == s2);
		System.out.println();
		 
		System.out.println(s1 == s2);
		
		
	//	System.out.println(obj);
		
		
		
	}

}
