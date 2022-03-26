/*
Name Yujin Bae
teacher: Ms. Krasteva
Date: February, 14, 2022
Description: this is the main class that will be the driver for the magic school bus
*/

public class MagicSchoolBusDriver
{
   public static void main (String[] args)
   {
      MagicSchoolBus m = new MagicSchoolBus("Buzzy Bus", "Ms. Krasteva", 30, "leisure", "William Lyon Mackenzie Collegiate Institute");
      m.introduce();
      m.travel();
      m.statusReport();
   }//end of main emthod
}//end of calss