package Appliance;

class Fridge extends Appliance {
	 
	private int freezerCapacity;
	private int fridgeCapacity;
	private int noOfFridgeShelves;
	
	public int getfreezerCapacity() {return freezerCapacity;}
	public int getfridgeCapacity() {return fridgeCapacity;}
	public int getnoOfFridgeShelves( ) {return noOfFridgeShelves;}
	
	public void setfreezercapacity(int s) {freezerCapacity = s;}
	public void setfridgeCapacity(int s) {fridgeCapacity = s;}
	public void  setnoOfFridgeShelves(int s) {noOfFridgeShelves = s;}
	//bad selection of string because it is already been used by java
	public String toString() {
		
		String s =" brand :" + brand + " model :  "+ model +" type : " +  type + " dimensions :  " + dimensions + " fridgeCapacity : " + fridgeCapacity + " freezerCapacity : " + freezerCapacity +" noOfFridgeShelves:  " +noOfFridgeShelves +" year : " + year + " price :  " + price;
				
		return s;
	
	}
	//i create a constructor
	public Fridge(String brand1, String model1, String type1, String dimensions1, int fridgeCapacity1,int freezerCapacity1 ,int noOfFridgeShelves1, int year1, double price1) {
		
		brand=brand1;
		model=model1;
		type=type1;
		dimensions=dimensions1;
		fridgeCapacity=fridgeCapacity1;
		freezerCapacity=freezerCapacity1;
		noOfFridgeShelves=noOfFridgeShelves1;
		year=year1;
		price=price1;
		
	
	}

}