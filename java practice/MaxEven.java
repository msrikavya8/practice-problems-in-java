public class MaxEven{
    public static void main(String[] args) {
        int[] arr = {12, 7, 9, 20, 15, 8};

        int maxEven = -1;   

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] > maxEven) {
                maxEven = arr[i];
            }
        }

        if (maxEven == -1) {
            System.out.println("No even elements found");
        } else {
            System.out.println("Maximum even element: "+ maxEven);
        }
    }
}