package Algorithm;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {222,33,44,2,4,5,6,7,8,66};
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int  j = arr.length-1; j>i; j--) {
                if(arr[j] < arr[j-1]){
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]= tmp;

                }

            }
        }
        for( double number : arr){
            System.out.println(number);
        }

        }
}
