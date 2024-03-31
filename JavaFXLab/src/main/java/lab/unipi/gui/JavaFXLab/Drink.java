package lab.unipi.gui.JavaFXLab;


public class Drink {
		protected String drinktype;
		protected String temperature;
		protected String sweetener;
		protected String syrup;
		protected String dairy;
		protected String extra;
		
		//creation of the constructor
		public Drink (String temperature, String sweetener, String syrup, String dairy, String extra){
			this.setTemp(temperature);
			this.setSweet(sweetener);
			this.setSyrup(syrup);
			this.setDairy(dairy);
			this.setExtra(extra); 
		}
		
		//creation of setters/getters
		public void setType(String drinktype) {
			this.drinktype=drinktype;
		}
		public String getType() {
			return this.drinktype;
		}
		public void setTemp(String temperature) {
			this.temperature=temperature;
		}
		public String getTemp() {
			return this.temperature;
		}
		public void setSweet(String sweetener) {
			this.sweetener=sweetener;
		}
		public String getSweet() {
			return this.sweetener;
		}
		public void setSyrup(String syrup) {
			this.syrup=syrup;
		}
		public String getSyrup() {
			return this.syrup;
		}
		public void setDairy(String dairy) {
			this.dairy=dairy;
		}
		public String getDairy() {
			return this.dairy;
		}
		public void setExtra(String extra) {
			this.extra=extra;
		}
		public String getExtra() {
			return this.extra;
		}
	}
