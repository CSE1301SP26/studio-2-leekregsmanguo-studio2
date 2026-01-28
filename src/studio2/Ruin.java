import java.util.Scanner;
public class Ruin {
    public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);


    System.out.print ("Put your start amount.");
    int startAmount;
    startAmount=in.nextInt();
    System.out.print ("What is your desired win chance?");
    double winChance;
    winChance=in.nextDouble();
     System.out.print ("What is your win limit?");
    int winLimit;
    winLimit=in.nextInt();
    int totalSimulations;
    System.out.print ("How many time of simulations you want to do?");
    totalSimulations= in.nextInt();
    
   while (startAmount<winLimit && startAmount>0)
    {
 

   
    double x=Math.random();
        if (x<winChance)
        {
            startAmount++;

            System.out.println(startAmount + "win");
        }

        else {
            startAmount--;
             System.out.println (startAmount + "lose");

        }


   }
  System.out.println ("ending the game");



    
    


    }


}
