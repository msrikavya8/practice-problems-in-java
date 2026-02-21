public class PowerOfFour{
  public static void main(String args[]){
    int n = 16;
 if(n>0 && (n&(n-1)) == 0 && (n & 0x55555555)!=0){
  System.out.println("power of four");
 }else{
 System.out.println(" not a power of four");
  }
 }
}