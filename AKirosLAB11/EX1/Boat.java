public class Boat 
{
   public String color;
   public int length;

   public Boat()
   {
      this.setColor("white");
      this.setLength(20);
   }

   public Boat(String colorOfBoat, int lengthOfBoat)
   {
      this.setColor(colorOfBoat);
      this.setLength(lengthOfBoat);
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) 
   {
      if(color.equalsIgnoreCase("white") || color.equalsIgnoreCase("blue") || color.equalsIgnoreCase("red") || color.equalsIgnoreCase("yellow"))
      {
        this.color = color;
      }
      
      else
      {
        System.out.println("Error: Boats can only be white, red, blue and yellow.");
      }

   }

   public int getLength(){return length;}


   public void setLength(int length) 
   {
      if(length>=20 && length <=50){
        this.length = length;
      }

      else{
        System.out.println("Error: Boats can only be between 20 and 50 feet, inclusively");
      }

   }

   @Override
      public String toString() 
      { 
          return String.format("Color = "+color+" Length = "+length); 
      }   
}
