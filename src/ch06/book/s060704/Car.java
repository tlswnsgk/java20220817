package ch06.book.s060704;

public class Car {
//필드
	String Company = "현대자동차";
	String model;
	String color; 
	int maxSpeed;
	
	//생성자
	Car(){
		
	}
	Car(String model){
		
	}
	Car(String model, String color){
		this.model = model;
		this.color = color;
		
	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
