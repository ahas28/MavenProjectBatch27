package J_ProgramCollections;

public class BreakContinueStatement {
	
	public static void breakStatement() {
		for(int i = -5; i < 1200; i++) {
			if(i == 600) {
				break;
				
			}
			System.out.println(i);
			}
		
	}
	
	public static void continueStatement() {
		for(int i = 0; i < 1200; i++) {
			if(i == 600) {
				continue;
			}
			System.out.println(i);
		}
	}
		public static void findNameResturants() {
		String [] Resturants = {"Mcdonalds","KFC","Burger King","5 Guys"};
		
		for(String newResturants : Resturants) {
			if(newResturants.contains("KFC")) {
				System.out.println(newResturants);
			}
		}
		}
		
	
public static void main(String[] args) {
	//BreakContinueStatement.breakStatement();
	//BreakContinueStatement.continueStatement();
	BreakContinueStatement.findNameResturants();
}
}
