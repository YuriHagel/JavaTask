package Algorithm;

public class Insertion {
    public static void main(String[] args) {
////        Сортировка
        int[] arr = {22,33,222,55,356};
//
//        for (int i = 0; i <arr.length ; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    int tmp = arr[j];
//                    arr[j] = arr[i];
//                    arr[i] = tmp;
//                }
//            }
//        }
//        for (int number :arr) {
//            System.out.println(number);
//
//        }
//////////////////////////////////
//        for (int i = 1; i < arr.length; i++){
//            for ( int j = i; j > 0 && (arr[i] < arr[j-1]); j-- ){
//                int tmp = arr[j];
//                arr[j] = arr[j-1];
//                arr[j-1] = tmp;
//            }
//        }
//        for ( int number : arr){
//            System.out.println(number);
//        }
//    }
//}

        arr  = sort(arr);
        for(int number : arr){
            System.out.println(number);
        }
    }
    static int[] sort(int[] arr){
        for(int i=1; i<arr.length; i++){
            for(int j=i;j>0 && (arr[j]<arr[j-1]);j--){
                int tmp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=tmp;
            }
        }
        return arr;
    }
}
