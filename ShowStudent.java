import java.util.Scanner;

public class ShowStudent {
   public static void main(String[] args) {
       Scanner show = new Scanner(System.in);
       System.out.println("Enter Id number: ");
       int ID = show.nextInt();
       System.out.println("Enter number of points: ");
       int pts = show.nextInt();
       System.out.println("Enter number of credits: ");
       int hrs = show.nextInt();
       Student s = new Student(ID, pts, hrs);
       System.out.println(s);
   }
}