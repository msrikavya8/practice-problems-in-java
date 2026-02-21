public class CountSetBits{
 public static void main(String[] args){
     int n=12;      // ----- --i =7
     int count=0;
 while(n>0){
  n = n&(n-1);    //------- i = i-(i & -1)
  count++;
}
 System.out.println("setbits= " + count);
}
}