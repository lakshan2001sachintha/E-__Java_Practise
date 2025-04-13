import java.util.Scanner;

public class EHandle {
   // for exception handling we use (try and catch) block
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter your first num : ");
      int a = sc.nextInt();

      System.out.print("Enter Your second num : ");
      int b = sc.nextInt();

      try{
         System.out.println("The answer is : "+(a/b));
      }catch(Exception e){
         System.out.println("The error is : "+e);
      }
      System.out.println("Bye");
   }
}