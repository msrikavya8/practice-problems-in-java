import java.util.Scanner;
public class Time{
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
      int time = intnext();
   int h=time/3600;
   int m=time%3600;
   int r=m/60;
   int s=r%60;
 System.out.print(H,m,s);
 }
}