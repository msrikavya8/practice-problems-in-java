 import java.util.Scanner;
 public class CountPair{
   public static void main(String[] args){
      Scanner sc =new Scanner(System.in);
      int n = sc.nextInt();
     int[] arr = new int[n];
 for(int i=0; i<n;i++){
   arr[i]= sc.nextInt();
   }
 for(int i=0; i<n-1;i++){
   for(int j=i+1;j<n;j++){
    System.out.println(arr[i]+" "+ arr[j]);   // if(arr[i] + arr[j] > max)
    }                                          //  max = arr[i] + arr[j];
   }
  } 
 }                                             //   S.o.pln(max);

                                              // sopln(arr[i]+ " "+ arr[j])