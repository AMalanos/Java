package Appliance;

public class TestStore {
	public static void main(String[] args) {
		//i create my products
		Dishwasher d1 = new Dishwasher ("Bosch"," DW50R4050BB/EO","Εντοιχιζόμενο","85 x 45 x 55","10 σερβίτσια",46,2022,669.99);
		Dishwasher d2 = new Dishwasher ("Mile"," MI54F6070GG/AR","Μη-Εντοιχιζόμενο","90 x 50 x 60","20 σερβίτσια",52,2012,499.99);
		Dishwasher d3 = new Dishwasher ("Mitsubishi","EW-45H1S","Εντοιχιζόμενο","80 x 40 x 50","5 σερβίτσια",46,2000,799.99);
	   
		Oven o1 = new Oven("Toshiba","AJHFJK4785","Ηλεκτρικος","59.5 x 56 x 55",27,"Πυρόλυση",2020,499.99);
		Oven o2 = new Oven("Mitsubishi","AGHFOAPOGF4764","Αερος","60 x 50 x 40",50,"Συστημα Ευκολου Καθαρισμου",2022,899.99);
		Oven o3 = new Oven("Toshiba","AJHFJK4785","Γκαζιου","20 x 70 x 40",20,"Πυρόλυση",2021,399.99);
		
		Fridge f1 = new Fridge ("Fujitsu","DJD473","Δίπορτο","87x25x29",56,24,4,2019,749.99);
		Fridge f2 = new Fridge ("Pitsos","PITSD744783","Οικολογικό","77x23x32",50,22,4,2016,649.99);
		Fridge f3 = new Fridge ("Phillips","FJKKD389","Ταχείας ψύξης","84x28x27",60,28,6,2015,349.99);
		//i create an array
		Appliance[] array;
		array= new Appliance [9];
		
		array[0]=d1;
		array[1]=d2;
		array[2]=d3;
		array[3]=o1;
		array[4]=o2;
		array[5]=o3;
		array[6]=f1;
		array[7]=f2;
		array[8]=f3;
		//i create min prices
		double min1=9999999;
		double min2=9999999;
		double min3=9999999;
		//and some tokens
		int token1=0;
		int token2=0;
		int token3=0;
		//here i search the cheapest product per type
		for(int i=0; i<9; i++) {
			
			if ((String.valueOf(array[i].getClass())).equals("class Appliance.Dishwasher")) {
				if(array[i].getprice()<min1) {
					
					min1=array[i].getprice();
					token1=i;
					
				}
			}
			
            if ((String.valueOf(array[i].getClass())).equals("class Appliance.Oven")) {
                   if(array[i].getprice()<min2) {
					
					min2=array[i].getprice();
					token2=i;
					
				}
			}
            
            if ((String.valueOf(array[i].getClass())).equals("class Appliance.Fridge")) {
	          
                   if(array[i].getprice()<min3) {
					
					min3=array[i].getprice();
					token3=i;
					
				}
          }
		}
		
		System.out.println("The cheapest Dishwasher is"+array[token1].toString());
		System.out.println("The cheapest Oven is"+array[token2].toString());
		System.out.println("The cheapest Fridge is"+array[token3].toString());
		//here i apply the discount of 20.5%, you didnt give me one so i assumed i can put whatever i wanted
          for(int i=0; i<9; i++) {
			
			if (array[i].getyear()<=2017) {
				
				(array[i]).addDiscount(20.5);
				System.out.println(array[i].toString());
			}
			
	     }
          
          System.out.println("");
          
          // here i print out the product by type
          for(int i=0; i<9; i++) {
  			
  			if ((String.valueOf(array[i].getClass())).equals("class Appliance.Oven")) {
  				
  					System.out.println(array[i].toString());
  			  }
          }
  			for(int i=0; i<9; i++)
  				
              if ((String.valueOf(array[i].getClass())).equals("class Appliance.Fridge")) {
                     
            	  System.out.println(array[i].toString());
  			  }
	
  			
	        for(int i=0; i<9; i++)
	        	
              if ((String.valueOf(array[i].getClass())).equals("class Appliance.Dishwasher")) {
    	        
            	  System.out.println(array[i].toString());
					
              }
           }
      
   }
