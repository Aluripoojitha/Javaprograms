package com.java.polymorphism;

public class VehicleOverriding {
	void run()

	{
		System.out.println("Vehicle is running");
	}
	 static  class bike extends VehicleOverriding{
		void run() {
			System.out.println("bike is running safely");
			
		}
		public static void main(String args[])
		{
			bike obj = new bike();
			obj.run();  
		}
		
	}
	

}
