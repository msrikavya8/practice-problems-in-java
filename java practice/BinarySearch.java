import java.util.Scanner;                       
class BinarySearch{
   public static void main(String[] args){       
      Scanner sc =new Scanner(System.in);
      int n = sc.nextInt();
     int[] arr = new int[n];
   for(int i=0; i<n; i++){
   arr[i]= sc.nextInt();
int x=sc.nextInt();
}
int l=0;
int m;
int r=n-1;
int f=0;
while(l<=r){
    m=(l+r)/2;
    if(arr[m]==x){
        f=1;
        break;
    }
    else if(x > arr[m]){
        l = m+1;
    }
    else{
        r=m-1;
    }
    if(f==1)
        System.out.println("found");
    else
        System.out.println("not found");
   }
  }
}