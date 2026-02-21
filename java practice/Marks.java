import java.util.scanner;
public class Marks{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in)
   int marks = intnext();
  if(marks > 100){
     System.out.prinln("invalid marks");
   else if(marks >91){
    System.out.prinln("grade A");
   }
  else if(marks >81){
    System.out.prinln("grade B");
   }
 else if(marks >71){
    System.out.prinln("grade C");
   }
else if(marks >61){
    System.out.prinln("grade D");
   }
else if(marks >51){
    System.out.prinln("grade E");
   }
else{
   System.out.println("fail");
   }
  }
 }
}