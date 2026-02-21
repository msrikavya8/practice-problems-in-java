class RecursionFibonoci{
  static int qwer(int x){
    if(x==1)
       return 1;
    if(x==2)
       return 2;
     return qwer(x-1) + qwer(x-2);
   }
  public static void main(String[] args){
  for(int i=1;i<=10;i++)
    System.out.println(qwer(i)+" ");
   }
  }
    