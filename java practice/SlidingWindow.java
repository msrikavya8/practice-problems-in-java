import java.util.Scanner;
public class SlidingWindow{
   public static void main(String[] args){
      Scanner sc =new Scanner(System.in);
      int n = sc.nextInt();
     int[] arr = new int[n];
   for(int i=0; i<n; i++){
   arr[i]= sc.nextInt();
} 
int k = sc.nextInt();
int sum = 0,max=0;
int l=0,r=0;
for(r=0;r<k;r++){
   sum=sum+arr[r];
 }
max = sum;
r= r-1;
while(r<n-1){
 sum = sum-arr[l];
l++;
r++;
sum = sum+arr[r];
if(sum>max)
   max = sum;
}
System.out.println(max);
}
}