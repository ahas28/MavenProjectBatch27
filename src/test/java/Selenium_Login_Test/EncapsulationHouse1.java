package Selenium_Login_Test;

public class EncapsulationHouse1 {

			
		private String houseName = " Commuinity Town House ";
		
		private String PriceOFHouse = "130000";

		public String getHouseName() {
			return houseName;
		}

		public void setHouseName(String houseName) {
			this.houseName = houseName;
		}

		public String getPriceOFHouse() {
			return PriceOFHouse;
		}

		public void setPriceOFHouse(String priceOFHouse) {
			PriceOFHouse = priceOFHouse;
		}
		
		public static void main(String[] args) {
			EncapsulationHouse1 obj = new EncapsulationHouse1 ();
		     System.out.println(obj.getPriceOFHouse());
		     System.out.println(obj.getHouseName());
		}
		

	

}
