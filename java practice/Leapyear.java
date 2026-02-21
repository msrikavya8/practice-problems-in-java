public class Leapyear{
  public static void main(String[] args){
   int year = 2000;
    if(year % 4 == 0 && (year %100 != 400)){
       System.out.println("leapyear");
     }      
   else{
    System.out.println("no a leapyear");
   }
  }
 } 