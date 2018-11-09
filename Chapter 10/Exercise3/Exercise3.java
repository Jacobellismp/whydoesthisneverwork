public class Exercise3
{  
  public static void main ( String[] args )  
  {
   double degrees = 30;
   double sinx = 1;
   double cosx = 1;
   double sum = 1;
   double rad = 1;

   sinx = (Math.sin(degrees));
   cosx = (Math.cos(degrees));
   sum = ((sinx * sinx)+(cosx * cosx));
   
   rad = sum * Math.PI/180;

   System.out.println("sine: " + sinx + " cosine: " + cosx + " sum of squares: " + sum + " rads: " + rad);
  }
}