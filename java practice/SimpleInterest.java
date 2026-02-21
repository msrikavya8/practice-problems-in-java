import java.util.Scanner;
public class SimpleInterest{
 public static void main(String[] args){
  Scanner sc =new Scanner(System.in);
  System.out.println("enter a principal:");
  double p = sc.nextDouble();
  System.out.println("enter a t value:");
  double t= sc.nextDouble();
  System.out.println("enter a r value:");
  double r = sc.nextDouble();
  double simpleInterest=(p*t*r)/100;
  System.out.println(simpleInterest);
  sc.close();
  }
}

