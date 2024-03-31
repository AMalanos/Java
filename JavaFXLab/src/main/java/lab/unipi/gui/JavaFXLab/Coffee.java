package lab.unipi.gui.JavaFXLab;

public class Coffee extends Drink {
	
	private String coffee_type;
	private String dosage;
	private int quantity;
  
	//creation of the constructor
  public Coffee (String temperature, String sweetener, String syrup, String dairy, String extra,String coffee_type,String dosage ,int quantity) {
	  super(temperature,sweetener,syrup,dairy,extra);
	  this.setCoffeeType(coffee_type);
	  this.setDosage(dosage);
	  this.setQuantity(quantity);
  }
//creation of setters/getters
  public void setCoffeeType(String coffee_type) {
	  this.coffee_type=coffee_type;
  }
  public String getCoffeeType() {
	  return this.coffee_type;
  }
  public void setDosage(String dosage) {
	  this.dosage=dosage;
  }
  public String getDosage() {
	  return this.dosage;
  }
  public void setQuantity(int quantity) {
	  this.quantity=quantity;
  }
  public int getQuantity() {
	  return this.quantity;
  }
  
}