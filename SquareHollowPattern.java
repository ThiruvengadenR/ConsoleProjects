class SquareHollowPattern
{
  void squareHallowWhileLoop()
   {
      
      int row=1,column=1;
      while(row<=10)
      {  
          while(column<=9)
          {  
              System.out.print("* ");
              column++;
          } 
          System.out.println("* ");
          row++; 

          if((row==1 || column==1))
          {
   	     System.out.println("* ");
          }	
          else
          {
   	     System.out.println(" ");
          }	
          
       }
   }


   public static void main(String pattern[])
   {
      SquareHollowPattern she = new SquareHollowPattern();
      she. squareHallowWhileLoop();
   }
}