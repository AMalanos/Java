package lab.unipi.gui.JavaFXLab;


public interface PriceList {
	//here we define the prices for each product//
	double coffee_type = 2.00;
	
	double coffee_single=0.00;
	double coffee_double=0.30;
	
	double beverage_price =3.00;
	
	double beverage_small=0.00;
	double beverage_medium=0.30;
	double beverage_large=0.60;
	
	double syrup_all_flavours=0.30;
	double whipped_cream=0.30;
	
	public double calculateTotalPrice();
}
