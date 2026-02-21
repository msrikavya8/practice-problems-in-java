import java.util.Scanner;
public class TriangleType{
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
 
  if(!isValidTriangle(a, b, c)){
     System.out.println("INVALID TRIANGLE");
 }else if(a == b && b == c){
   System.out.println("EQUILATERAL");
 }else if(a == b || b == c || a == c){
   System.out.println("ISOSCELES");
}else{
   System.out.println("SCALENE");
  }
}

static boolean isValidTriangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) 
       return false;

        return (a + b > c) &&(a + c > b) &&(b + c > a);
                        
    }
}
