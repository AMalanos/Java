package lab.unipi.gui.JavaFXLab;

public class Beverage extends Drink {
  
	private String beverage_type;
	private String size;
  
	//creation of the constructor
  public Beverage (String sweetener, String syrup, String dairy, String extra,String beverage_type, String size,String temperature ) {
	 super(temperature,sweetener,syrup,dairy,extra);
	  this.setBeverage_type(beverage_type);
	  this.setSize(size);
  }
//creation of setters/getters
  public void setBeverage_type(String beverage_type) {
	  this.beverage_type=beverage_type;
  }
  public String getbeverage() {
	  return this.beverage_type;
  }
  public void setSize(String size) {
	  this.size=size;
  }
  public String getSize() {
	  return this.size;
  }
}