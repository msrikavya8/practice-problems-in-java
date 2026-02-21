import java.util.Scanner;
public class Greedy{
   public static void main(String[] args){
      Scanner sc =new Scanner(System.in);
      int n = sc.nextInt();
     int[] arr = new int[n];
   for(int i=0; i<n; i++){
   arr[i]= sc.nextInt();
} 
  int sum =0;
  int max = 0;
  int k = sc.nextInt();
for(int i = 0; i<n-k; i++){
  for(int j= i; j < i+k; j++){
    sum = sum+arr[j];
    }
  if(sum > max)
     max = sum;
  sum = 0;
   }
System.out.print(max);
  }
 }