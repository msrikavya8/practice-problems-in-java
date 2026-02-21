class SumArrayRecursion{
    static int sumArray(int[] arr ,int i){
      if(i == arr.length) return 0;
        return arr[i]+sumArray(arr,i+1);
}
public static void main(String[] args){
  int[] arr = {10,3,5,20,7};
 System.out.println(sumArray(arr,0));
 }
}
  