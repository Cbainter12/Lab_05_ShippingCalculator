import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
     Scanner in = new Scanner(System.in);
     int productPrice = 0;
     double shippingCost = 0;
     double totalCost = 0;

        System.out.println("Enter the cost of your product: ");
       if (in.hasNextInt())
       {
           productPrice = in.nextInt();
           in.nextLine();

           if (productPrice <= 100)
           {
               System.out.println("Your shipping is FREE!");
               System.out.println("Your total is " + productPrice);
           }
           else
           {
               shippingCost = productPrice * .02;
               totalCost = productPrice + shippingCost;
               System.out.println("the cost of shipping is " + shippingCost + " and your total cost is " + totalCost);
           }
       }
    }
}