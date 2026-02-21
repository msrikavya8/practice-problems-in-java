public class UniqueNumber{
  public static void main(String[] args){
   int[] arr={2,3,5,2,3,};
   int unique=0; 
   for(int num:arr){
    unique=unique^num;
  }
System.out.println(unique); 
 }
}     
