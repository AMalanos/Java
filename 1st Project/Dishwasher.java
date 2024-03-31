package Appliance;


	public class Dishwasher extends Appliance {
		 
			private String capacity;
			private int noiseLevel;
			
			public String getcapacity() {return capacity;}
			public int getnoiseLevel() {return noiseLevel;}
			
			public void setcapacity(String s) {capacity = s;}
			public void setnoiseLevel(int s) {noiseLevel = s;}
			//bad selection of string because it is already been used by java
			public String toString() {
				
				String s =" brand :" + brand + " model :  "+ model +" type : " +  type + " dimensions :  " + dimensions + " capacity : " + capacity + " noiseLevel : " + noiseLevel + " year : " + year + " price :  " + price;
						
				return s;
			
			}
			//i create a constructor
			public Dishwasher(String brand1, String model1, String type1, String dimensions1, String capacity1, int noiseLevel1, int year1, double price1) {
				
				brand=brand1;
				model=model1;
				type=type1;
				dimensions=dimensions1;
				capacity=capacity1;
				noiseLevel=noiseLevel1;
				year=year1;
				price=price1;
				
			
			}
	}

