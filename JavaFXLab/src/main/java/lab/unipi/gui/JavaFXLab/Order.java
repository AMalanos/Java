package lab.unipi.gui.JavaFXLab;
import java.util.ArrayList;

class Order implements PriceList{
	private int order_num;
	private Drink drink;
	private String date;
	private String deliver;
	private String place;
	private String condition;
	private String orders[];
	
	public double calculateTotalPrice(){
		double temp=0;
		if(drink instanceof Coffee) {
			temp = coffee_type;
			if(((Coffee)drink).getDosage().equals("Double") ) {
				temp += coffee_double;
			}
			if((drink).getExtra().equals("Syrup")) {
				temp += syrup_all_flavours;
			}else if((drink).getExtra().equals("Whipped cream")){
				temp += whipped_cream;
			}
		}else if(drink instanceof Beverage) {
			temp = beverage_price;
			if(((Beverage)drink).getSize().equals("Medium")){
				temp += beverage_medium;
			}else if(((Beverage)drink).getSize().equals("Large")) {
				temp += beverage_large;
			}
			if((drink).getExtra().equals("Syrup")) {
				temp += syrup_all_flavours;
			}else if((drink).getExtra().equals("Whipped cream")){
				temp += whipped_cream;
			}
		}
		return temp;
	}
	
	//creation of setters/getters
			public void setOrder_num(int order_num) {
				this.order_num=order_num;
			}
			public int getOrder_Num() {
				return this.order_num;
			}
			public void setDrink(Drink drink) {
				this.drink=drink;
			}
			public Drink getDrink() {
				return this.drink;
			}
			public void setDate(String date) {
				this.date=date;
			}
			public String getDate() {
				return this.date;
			}
			public void setDeliver(String deliver) {
				this.deliver=deliver;
			}
			public String getDeliver() {
				return this.deliver;
			}
			public void setPlace(String place) {
				this.place=place;
			}
			public String getPlace() {
				return this.place;
			}
			public void setCondition(String condition) {
				this.condition=condition;
			}
			public String getCondition() {
				return this.condition;
			}
			

			public static void main(String[] args) {
				
				ArrayList<String> orders =new ArrayList<String>(10);
				
			}

}


