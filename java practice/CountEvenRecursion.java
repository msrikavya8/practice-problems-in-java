class CountEvenRecursion{
   static int countEven(int[] arr, int i){
    if(i == arr.length) return 0;
      if(arr[i] % 2 ==0){
  return 1 + countEven(arr,i+1);
       }
    else{ 
       return countEven(arr,i+1);
   }
     }
public static void main(String[] args){
  int[] arr ={2,5,8,7,10,13};
System.out.println(countEven(arr,0));
   }
  }                                           



