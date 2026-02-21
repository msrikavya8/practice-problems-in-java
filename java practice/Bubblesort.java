import java.util.Scanner;                       
public class Bubblesort{
   public static void main(String[] args){       
      Scanner sc =new Scanner(System.in);
      int n = sc.nextInt();
     int[] arr = new int[n];
   for(int i=0; i<n; i++){
   arr[i]= sc.nextInt();
   }
     for(int j =0;j<n-1;j++){
         int f=0;
     for(int i = 0;i<n-1-j;i++){
        if(arr[i]>arr[i+1]){
            f=1;
            int t = arr[i];
            arr[i]=arr[i+1];
            arr[i+1] = t;
        }
    }
    
   if(f==0)
        break;
   }
      for(int i = 0;i<n;i++){
       System.out.print(arr[i] + " ");
      }
   }
  }