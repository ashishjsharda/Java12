package Java12;

/**
  * Lambda Function 
  * @param args
  */
interface EvenTest{
public boolean testEven(int n);
}
public class LambdaFunc {

  public static void main(String args[])
  {
    EvenTest num=(n) ->(n%2==0);
    System.out.println(num.testEven(20));
    System.out.println(num.testEven(5));

  }

}
