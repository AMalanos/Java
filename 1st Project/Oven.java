package Appliance;

class Oven extends Appliance {
	 
	private int capacity;
	private String cleaning;
	
	public int getcapacity() {return capacity;}
	public String getcleaning() {return cleaning;}
	
	public void setcapacity(int s) {capacity = s;}
	public void setcleaning(String s) {cleaning = s;}
	//bad selection of string because it is already been used by java
    public String toString() {
		
		String s =" brand :" + brand + " model :  "+ model +" type : " +  type + " dimensions :  " + dimensions +" capacity : " + capacity+ " cleaning : " + cleaning + " year : " + year + " price :  " + price;
				
		return s;
	
	}
    //i create a constructor
    public Oven(String brand1, String model1, String type1, String dimensions1, int capacity1, String cleaning1, int year1, double price1) {
		
		brand=brand1;
		model=model1;
		type=type1;
		dimensions=dimensions1;
		capacity=capacity1;
		cleaning=cleaning1;
		year=year1;
		price=price1;
		
	
	}
}
