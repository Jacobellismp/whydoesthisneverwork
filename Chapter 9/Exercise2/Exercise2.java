public class Exercise2
{
  public static void main ( String[] args )
  {
    double x = 4.0;
    double value = 1;
    value = ((3 * x * x) - (8 * x) + (4));
    System.out.println("At X = " + x);
    System.out.println("The value is " + value);

    x = 2.0;
    value = ((3 * x * x) - (8 * x) + (4));
    System.out.println("At X = " + x);
    System.out.println("The value is " + value);

    x = 0.0;
    value = ((3 * x * x) - (8 * x) + (4));
    System.out.println("At X = " + x);
    System.out.println("The value is " + value);
  }
}