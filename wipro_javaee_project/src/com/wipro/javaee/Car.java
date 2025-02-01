/**
 * 
 */
package com.wipro.javaee;

/**
 * 
 */
public class Car {

	/**
	 * 
	 */
	String brandValue;
	int mileageValue;
	Car(String brand ,int mileage ){
		this.brandValue=brand;
		this.mileageValue=mileage;
	}
	void display(){
		System.out.println("car brand:"+brandValue+"Car mileage"+mileageValue);;
	}
	
	public static void main(String[] args) {
		Car carobject1=new Car("maruti",120);
		Car carobject2=new Car("ford",30);
		carobject1.display();
		carobject2.display();


	}

}
