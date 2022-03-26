/*
Name Yujin Bae
teacher: Ms. Krasteva
Date: February, 14, 2022
Description: this is the sub class magic school bus that will extend the bus
*/

public class MagicSchoolBus extends Bus{
   //variable declaration
   String name = "the Bus";
   String supervisor = "Ms. Firzzle";
   int students = 8;
   String purpose = "education";
   String school = "Walkerville Elementary";
   double size = 5.5;
   String destination = "space";
   String shape = "rocket";
   String overheadSign = "WAHOO!";
   int year = 2022;
   
   //constructors (overloadexd)
   //1st constructor: constrcutor with default values
   public MagicSchoolBus(){
      super("yellow", 12, "schoolbus", 4, 200);
   }
   
   //2nd constructor: constructor with given name, supervisor, students, purpose, and school
   public MagicSchoolBus(String nam, String sup, int stu, String purp, String sch){
      super("yellow", 12, "schoolbus", 4, 200);
      name = nam;
      supervisor = sup;
      setDriver(supervisor);
      students = stu;
      purpose = purp;
      school = sch;
   }
   
   //this method will get the size of the bus
   public double getSize(){
      return size;
   }
   
   //this method will get the destination of the bus
   public String getDestination(){
      return destination;
   }
   
   //this method will get the shape of the bus
   public String getShape(){
      return shape;
   }
   
   //this method will get the overhead sign of the bus
   public String getOverheadSign(){
      return overheadSign;
   }
   
   //this method will get the year the bus is in
   public int getYear(){
      return year;
   }
   
   //this method will set the size of the bus
   public void setSize(double si){
      size = si;
   }
   
   //this method will set the destination of the bus
   public void setDestination(String de){
      destination = de;
   }
   
   //this method will set the shape of the bus
   public void setShape(String sh){
      shape = sh;
   }
   
   //this method will set the overhead sign of the bus
   public void setOverheadSign(String ov){
      overheadSign = ov;
   }
   
   //this method will set the year the bus is in
   public void setYear(int yr){
      year = yr;
   }
   

   
   //this method will mkae the bus introduce itself
   public void introduce(){
      System.out.println("Hello, my name is " + name + ". ");
      System.out.println(information() );
      System.out.print("I am the magical school bus of " + supervisor);
      System.out.print(" and " + students + " students");
      System.out.println(" at " + school + ". ");
      System.out.println("My purpose is for " + purpose + ". \n");
   }
   
   //this method will make the bus make a honking sound
   public void honk(){
      System.out.println("HOOOOOONK!!!\n");
   }
   
   //this method will make the bus take attendance
   public boolean takeAttendance(){
      if (getPassengers() == students){
         return true;
      } else {
         return false;
      }
   }
   
   //this method will make the bus travel
   public void travel(){
      System.out.println("Well, let's go!");
      System.out.print("We're headed to " + destination);
      System.out.println(" in " + year + ". ");
      setFuel( getFuel() - 2*(year-2022) );
      System.out.print("Look at me! I am going to shapeshift into a " + shape);
      setFuel( getFuel() - 10 );
      System.out.println(" that is " + size + " metres big. \n");
      setFuel( getFuel() - 10 );
   }
   
   //this method will make the bus report its status
   public void statusReport(){
      System.out.println("Status Report: ");
      System.out.print("Our current destination is " + destination);
      System.out.println(" in the year " + year + ". ");
      System.out.print("I currently look like a " + shape);
      System.out.println(" and I am " + size + " metres big! ");
      System.out.println("My overhead sign says " + overheadSign);
      System.out.print("My driver is " + getDriver() );
      System.out.println(" and there are " + getPassengers() + " people riding me. ");
      System.out.print("My door is " + getDoor() );
      System.out.println(" and if you thought my lights are on, that's " + getLight() + ". " );
      System.out.println("I have " + getFuel() + " litres of fuel left. \n");
   }
}// end of class