package lab.unipi.gui.JavaFXLab;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Pos;

/**
 * JavaFX App
 */
public class App extends Application implements EventHandler<ActionEvent> {
	
	Stage window;
	
	Button coffee;
	Button beverage;
	Button ready;
	Button french;
	Button espresso;
	Button capuccino;
	Button coffeeccino;
	Button chocolatedrink;
	Button singleshot;
	Button doubleshot;
	Button nosugar;
	Button alittle;
	Button medium;
	Button sweet;
	Button smallsize;
	Button mediumsize;
	Button largesize;
	Button hot;
	Button cold;
	Button whitesugar;
	Button brownsugar;
	Button stevia;
	Button capsule;
	Button strawberrysyrup;
	Button hazelnutsyrup;
	Button caramelsyrup;
	Button chocolatesyrup;
	Button hundred;
	Button light;
	Button nolactoze;
	Button whippedcream;
	Button cinnamon;
	Button chocolate;
	
	Scene layout1, layoutCoffee1, main, coffee1, coffee2, coffee3, beverage1, beverage2, drink1, drink2, drink3, drink4 , drink5;
	
	
    @Override
    public void start(Stage primaryStage) throws Exception {
    	window = primaryStage;
    	
    	
    	//Creating our buttons for layout1
    	coffee = new Button();
    	coffee.setText("Coffee");
    	coffee.setOnAction(this);
    	
    	beverage = new Button();
    	beverage.setText("Beverage");
    	beverage.setOnAction(this);
    	
    	//Setting up the screen layout for the Drink selection.
    	VBox layout1 = new VBox(20);
    	layout1.getChildren().addAll(coffee, beverage);
    	
    	//Creating the scene layout
    	Scene main = new Scene(layout1, 300, 250);
    	
    	//Creating our buttons for layoutCoffee1
    	ready = new Button();
    	ready.setText("Ready");
    	ready.setOnAction(this);
    	
    	french = new Button();
    	french.setText("French");
    	french.setOnAction(this);
    	
    	espresso = new Button();
    	espresso.setText("Espresso");
    	espresso.setOnAction(this);
    	
    	capuccino = new Button();
    	capuccino.setText("Capuccino");
    	capuccino.setOnAction(this);
    	
    	//Here we are setting up the length of the window, as well as the buttons that will appear.
    	VBox layoutCoffee1 = new VBox(20);
    	layoutCoffee1.getChildren().addAll(french, ready, espresso, capuccino);
    	coffee1 = new Scene(layoutCoffee1, 300, 250);
    	
    	//Creating our buttons for layoutcoffee2
    	singleshot = new Button();
    	singleshot.setText("Single");
    	singleshot.setOnAction(this);
    	
    	doubleshot= new Button();
    	doubleshot.setText("Double");
    	doubleshot.setOnAction(this);
    	
    	//Here we are setting up the length of the window, as well as the buttons that will appear.
    	VBox layoutCoffee2 = new VBox(20);
    	layoutCoffee2.getChildren().addAll(singleshot,doubleshot);
    	coffee2 = new Scene(layoutCoffee2, 300, 250);
    	
    	
    	//Creating our buttons for layoutcoffee3
    	nosugar= new Button();
    	nosugar.setText("No sugar");
    	nosugar.setOnAction(this);
    	
    	alittle= new Button();
    	alittle.setText("A little sugar");
    	alittle.setOnAction(this);
    	
    	medium= new Button();
    	medium.setText("Medium sugar");
    	medium.setOnAction(this);
    	
    	sweet= new Button();
    	sweet.setText("Sweet");
    	sweet.setOnAction(this);
    	
    	//Here we are setting up the length of the window, as well as the buttons that will appear.
    	VBox layoutCoffee3 = new VBox(20);
    	layoutCoffee3.getChildren().addAll(nosugar, alittle, medium, sweet);
    	coffee3 = new Scene(layoutCoffee3, 300, 250);
    	
    	//Creating our buttons for layoutBeverage1
    	coffeeccino = new Button();
    	coffeeccino.setText("Coffeeccino");
    	coffeeccino.setOnAction(this);
    	
    	chocolatedrink = new Button();
    	chocolatedrink.setText("Chocolate");
    	chocolatedrink.setOnAction(this);
    	
    	//Here we are setting up the length of the window, as well as the buttons that will appear.
    	VBox layoutBeverage1 = new VBox(20);
    	layoutBeverage1.getChildren().addAll(coffeeccino, chocolatedrink);
    	beverage1 = new Scene(layoutBeverage1, 300, 250);
    	
    	//Creating our buttons for layoutBeverage2
    	smallsize= new Button();
    	smallsize.setText("Small");
    	smallsize.setOnAction(this);
    	
    	mediumsize= new Button();
    	mediumsize.setText("Medium");
    	mediumsize.setOnAction(this);
    	
    	largesize = new Button();
    	largesize.setText("Large");
    	largesize.setOnAction(this);
    	
    	//Here we are setting up the length of the window, as well as the buttons that will appear.
    	VBox layoutBeverage2 = new VBox(20);
    	layoutBeverage2.getChildren().addAll(smallsize, mediumsize, largesize);
    	beverage2 = new Scene(layoutBeverage2, 300, 250);
    	
    	//Creating our buttons for layoutDrink1
    	hot= new Button();
    	hot.setText("Hot");
    	hot.setOnAction(this);
    	
    	cold= new Button();
    	cold.setText("Cold");
    	cold.setOnAction(this);
    	
    	//Here we are setting up the length of the window, as well as the buttons that will appear.
    	VBox layoutDrink1 = new VBox(20);
    	layoutDrink1.getChildren().addAll(hot, cold);
    	drink1 = new Scene(layoutDrink1, 300, 250);
    	
    	//Creating our buttons for layoutDrink2
    	whitesugar= new Button();
    	whitesugar.setText("White sugar");
    	whitesugar.setOnAction(this);
    	
    	brownsugar= new Button();
    	brownsugar.setText("Brown sugar");
    	brownsugar.setOnAction(this);
    	
    	stevia=new Button();
    	stevia.setText("Stevia");
    	stevia.setOnAction(this);
    	
    	capsule=new Button();
    	capsule.setText("Capsule");
    	capsule.setOnAction(this);
    	
    	//Here we are setting up the length of the window, as well as the buttons that will appear.
    	VBox layoutDrink2 = new VBox(20);
    	layoutDrink2.getChildren().addAll(whitesugar, brownsugar, stevia, capsule);
    	drink2 = new Scene(layoutDrink2, 300, 250);
    	
    	//Creating our buttons for layoutDrink3
    	strawberrysyrup= new Button();
    	strawberrysyrup.setText("Strawberry syrup");
    	strawberrysyrup.setOnAction(this);
    	
    	hazelnutsyrup= new Button();
    	hazelnutsyrup.setText("Hazelnut syrup");
    	hazelnutsyrup.setOnAction(this);
    	
    	caramelsyrup=new Button();
    	caramelsyrup.setText("Caramel syrup");
    	caramelsyrup.setOnAction(this);
    	
    	chocolatesyrup= new Button();
    	chocolatesyrup.setText("Chocolate syrup");
    	chocolatesyrup.setOnAction(this);
    	
    	//Here we are setting up the length of the window, as well as the buttons that will appear.
    	VBox layoutDrink3 = new VBox(20);
    	layoutDrink3.getChildren().addAll(strawberrysyrup, hazelnutsyrup, caramelsyrup, chocolatesyrup);
    	drink3 = new Scene(layoutDrink3, 300, 250);
    	
    	//Creating our buttons for layoutDrink4
    	hundred= new Button();
    	hundred.setText("100% fat milk");
    	hundred.setOnAction(this);
    	
    	light= new Button();
    	light.setText("Light milk");
    	light.setOnAction(this);
    	
    	nolactoze= new Button();
    	nolactoze.setText("No lactose milk");
    	nolactoze.setOnAction(this);
    	
    	//Here we are setting up the length of the window, as well as the buttons that will appear.
    	VBox layoutDrink4 = new VBox(20);
    	layoutDrink4.getChildren().addAll(hundred, light, nolactoze);
    	drink4 = new Scene(layoutDrink4, 300, 250);
    	
    	//Creating our buttons for layoutDrink5
    	whippedcream=new Button();
    	whippedcream.setText("With whipped cream");
    	whippedcream.setOnAction(this);
    	
    	cinnamon=new Button();
    	cinnamon.setText("With syrup");
    	cinnamon.setOnAction(this);
    	
    	chocolate=new Button();
    	chocolate.setText("With chocolate");
    	chocolate.setOnAction(this);
    	
    	//Here we are setting up the length of the window, as well as the buttons that will appear.
    	VBox layoutDrink5 = new VBox(20);
    	layoutDrink5.getChildren().addAll(whippedcream, cinnamon, chocolate);
    	drink5 = new Scene(layoutDrink5, 300, 250);
    	
    	//Creating the scene layout
    	window.setScene(main);
    	window.setTitle("Java Cafe");
    	window.show();
    }

    
    @Override
	public void handle(ActionEvent event) {
		//These are the instances for the coffee selection.
		if(event.getSource()==coffee) {
			System.out.println("You want coffee");
			window.setScene(coffee1);
		}
		if(event.getSource()==ready) {
			System.out.println("You want a ready coffee");
			window.setScene(coffee2);
		}
		if(event.getSource()==french) {
			System.out.println("You want a french coffee");
			window.setScene(coffee2);
		}
		if(event.getSource()==espresso) {
			System.out.println("You want an espresso");
			window.setScene(coffee2);
		}
		if(event.getSource()==capuccino) {
			System.out.println("You want a capuccino");
			window.setScene(coffee2);
		}
		if(event.getSource()==singleshot) {
			System.out.println("You want a single coffee ");
			window.setScene(coffee3);
		}
		if(event.getSource()==doubleshot) {
			System.out.println("You want a double coffee ");
			window.setScene(coffee3);
		}
		if(event.getSource()==nosugar) {
			System.out.println("You want a coffee without sugar");
			window.setScene(drink1);
		}
		if(event.getSource()==alittle) {
			System.out.println("You want a coffee with a little sugar");
			window.setScene(drink1);
		}
		if(event.getSource()==medium) {
			System.out.println("You want a medium coffee");
			window.setScene(drink1);
		}
		if(event.getSource()==sweet) {
			System.out.println("You want a sweet coffee");
			window.setScene(drink1);
		}
		
		//These are the instances for the beverage selection.
		if(event.getSource()== beverage) {
			System.out.println("You want beverage");
			window.setScene(beverage1);
		}
		if(event.getSource()==chocolatedrink) {
			System.out.println("you want a chocolate");
			window.setScene(beverage2);
		}
		if(event.getSource()==coffeeccino) {
			System.out.println("you want a coffeccino");
			window.setScene(beverage2);
		}
		if(event.getSource()==smallsize) {
			System.out.println("you want it small-sized");
			window.setScene(drink1);
		}
		if(event.getSource()==mediumsize) {
			System.out.println("you want it medium-sized");
			window.setScene(drink1);
		}
		if(event.getSource()==largesize) {
			System.out.println("you want it large-sized");
			window.setScene(drink1);
		}
		
		//These are the extra instances that exist for both coffee and beverage.
		if(event.getSource()==hot) {
			System.out.println("you want it hot");
			window.setScene(drink2);
		}
		if(event.getSource()==cold) {
			System.out.println("you want it cold");
			window.setScene(drink2);
		}
		if(event.getSource()==whitesugar) {
			System.out.println("you want it with white sugar");
			window.setScene(drink3);
		}
		if(event.getSource()==brownsugar) {
			System.out.println("you want it with brown sugar");
			window.setScene(drink3);
		}
		if(event.getSource()==capsule) {
			System.out.println("you want a capsule");
			window.setScene(drink3);
		}
		if(event.getSource()==strawberrysyrup) {
			System.out.println("you want it with strawberry syrup");
			window.setScene(drink4);
		}
		if(event.getSource()==hazelnutsyrup) {
			System.out.println("you want it with hazelnut syrup");
			window.setScene(drink4);
		}
		if(event.getSource()==caramelsyrup) {
			System.out.println("you want it with caramelsyrup");
			window.setScene(drink4);
		}
		if(event.getSource()==chocolatesyrup) {
			System.out.println("you want it with chocolate syrup");
			window.setScene(drink4);
		}
		if(event.getSource()==hundred) {
			System.out.println("you want it with 100% fat milk");
			window.setScene(drink5);
		}
		if(event.getSource()==light) {
			System.out.println("you want it with light milk");
			window.setScene(drink5);
		}
		if(event.getSource()==nolactoze) {
			System.out.println("you want without lactoze milk");
			window.setScene(drink5);
		}
		if(event.getSource()==whippedcream) {
			System.out.println("you want whipped cream");
			
		}
		if(event.getSource()==cinnamon) {
			System.out.println("you want cinnamon");
			
		}
		if(event.getSource()==chocolate) {
			System.out.println("you want it with chocolate");
		}
		
	}
    
    
    






	public static void main(String[] args) {
        launch();
    }

}