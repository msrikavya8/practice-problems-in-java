import java.util.Scanner;                       
class Agressivecows{
   public static void main(String[] args){       
      Scanner sc =new Scanner(System.in);
      int n = sc.nextInt();
     int[] arr = new int[n];
   for(int i=1; i<n; i++)
   arr[i]= sc.nextInt();
int k=sc.nextInt();
int md = sc.nextInt();
k=k-1;
int pcs = arr[0];
for(int i =1 ;i<n;i++){
    if(arr[i] -pcs>=md){
        pcs = arr[i];
        k=k-1;
    }
    if(k==0)
       break;
}
if(k==0)
    System.out.print("P");
else
    System.out.print("NP");
 }
}