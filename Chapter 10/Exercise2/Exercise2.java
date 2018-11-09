public class Exercise2
{  
  public static void main ( String[] args )  
  {
   double value = 0.5236;
   double sinx = 1;
   double cosx = 1;
   double sum = 1;

   sinx = (Math.sin(value));
   cosx = (Math.cos(value));
   sum = ((sinx * sinx)+(cosx * cosx));

   System.out.println("sine: " + sinx + " cosine: " + cosx + " sum of squares: " + sum );
  }
}