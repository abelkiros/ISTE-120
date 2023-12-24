public class SailBoat extends Boat 
{
   private int numSails;
   private int calcPrice;

   public SailBoat()
   {
      super();
      setNumSails(1);
   }

   public SailBoat(String color, int length, int noOfSails)
   {
      super(color, length);
      super.color = color;
      super.length = length;
      setNumSails(noOfSails);
   }

   public int getNumSails() {return numSails;}

   public void setNumSails(int numSails) {this.numSails = numSails;}

   public int calcPrice() {return   calcPrice = super.length*1000+numSails*2000;}


    @Override
    public String toString() 
    { 
        return String.format(super.toString()+" Number of sails = "+numSails+" Price = "+calcPrice()); 
    }   
    
}