package Appliance;



 abstract class Appliance {
	//i declare the common fields the objects have
	public String brand;
	public String model;
	//I have to use protected type instead of private because i need the sub-classes to have access to them
	protected String type;
	protected String dimensions;
	protected int year;
	protected double price;
	//i dont have to use getters and setters on public methods, so i just use them on the private ones.
	public String getType() {return type;}
	public String getdimensions() {return dimensions;}
    public int getyear() {return year;}
    public double getprice() {return price;}
    
    public void setType(String s) {type = s;}
    public void setdimensions(String s) {dimensions = s;}
    public void setyear(int s) {year = s;}
    public void setprice(double s) {price=s;}
    //I declare her as abstract, so that every class can use her as it wants
    public abstract String toString();
    
    public void addDiscount(Double discount) {
    	
         price = price-price*discount/100;
         
    }
}

 

 
 