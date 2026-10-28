import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int num1 = scan.nextInt();
      int num2 = scan.nextInt();
      
      int result = num1 * num2;

      /*
      Multiplies and outputs the result of 2 integer inputs
      */
      
      System.out.println(num1 + " x " + num2 + " = " + result);
      /*
      Prints or outputs the problem and the result
      */

      //testing out our pizza object
      //initialize an object from our class
      Pizza firstPizza = new Pizza();
      System.out.println(firstPizza.isBaked);
   }
}