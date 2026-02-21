import java.util.Scanner;
public class ValidDateChecker{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
  
int day = sc.nextInt();
int month = sc.nextInt();
int year = sc.nextInt();

if(isValidDate(day,month,year)){
   System.out.println("VALID_DATE");
}
else{
  System.out.println("INAVLID_DATE");
 }
}

static boolean isValidDate(int day,int month,int year){
   if(month<1 ||month>12) 
     return false;
   
   if(day < 1) 
    return false;
   int maxDays = 31;

 switch(month)
  {
    case 2: 
        if(isLeapYear(year)){
           maxDays = 29;
        }else{
         maxDays= 28;
      }
     break;
case 4: case 6: case 9: case 11:
    maxDays = 30;
default:
    maxDays = 31;
}

   return day <= maxDays;
}

static boolean isLeapYear(int year){
  return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
 }
}




















    
