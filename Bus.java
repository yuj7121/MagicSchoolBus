/*
Name Yujin Bae
teacher: Ms. Krasteva
Date: February, 14, 2022
Description: this is the parent class bus
*/

public class Bus {
   //variable declaration
   private String colour = "Gray";
   private int seats = 10 ; //number of seats in the bus
   private String type = "minibus"; //whther it be a 
   private int wheels = 4;
   private double tankCapacity = 100;
   private String driver = "John Doe";
   private String door = "closed";
   private int passengers = 0;
   private double fuel = 100;
   private boolean light = false; //whther the lights are on or not
   
   //constructors (overloaded)
   //1st constructor. constructor with default values
   public Bus(){
   }
   
   //2nd constructor. constructor given colour, seats, type, wheels, and tank capacity
   public Bus(String col, int se, String typ, int whe, double tank){
      colour = col;
      seats = se;
      type = typ;
      wheels = whe;
      tankCapacity = tank;
   }
   
   //this method will return the driver
   public String getDriver(){
      return driver;
   }
   
   //this method will return the door status
   public String getDoor(){
      return door;
   }
   
   //this method will return the passenger
   public int getPassengers(){
      return passengers;
   }
   
   //this method will return the fuel
   public double getFuel(){
      return fuel;
   }
   
   //this method will return the light
   public boolean getLight(){
      return light;
   }
   
   //this method will change the driver
   public void setDriver(String dr){
      driver = dr;
   }
   
   //this emthod will change the door status
   public void setDoor(String doo){
      door = doo;
   }
   
   //this method will chnage the passengers
   public void setPassengers(int pa){
      passengers = pa;
   }
   
   //this method will chnage the fuel
   public void setFuel(double fu){
      fuel = fu;
   }
   
   //this method will chnage teh light status
   public void setLight(boolean li){
      light = li;
   }
   
   //this method will take in the distance and drive the bus, therofore use up the fuel
   public void drive(double distance){
      if (wheels==6){
         fuel -= distance*0.6;
      } else if ( type == "minibus" || type == "shuttle bus") {
         fuel -= distance*0.3;
      } else {
         fuel -= distance*0.4;
      }
   }//end of drive method
   
   //this method will take in the number of passengers to load them up and return true.
   //if there aren't enough seats, it will return false and not load any passengers
   public boolean load (int num){
      if ( num+passengers <= seats){
         passengers += num;
         return true;
      } else {
         return false;
      }
   }//end of load method
   
   //this method will return a string that is the information about the bus
   public String information(){
      return("I am a " + colour + " bus that has " + wheels + " wheels and " + seats + " seats. I am a " + type + " and my tank can hold up to " + tankCapacity + " litres of fuel. ");
   }
   
   //this method will start up the bus, which will turn on the engine, taking 0.01 litres of fuel, open the doors, and turn on the lights
   public void startUp(){
      fuel -= 0.01;
      light = true;
      door = "Open";
   }
}