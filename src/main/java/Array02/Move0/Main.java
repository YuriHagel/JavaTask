//package Array02.Move0;
//
//public class Main { // перемещение всех нулей в конец массива
//    private static void main() {
//        int range[]={1,2,7,0,11,0,-8,5,3,2,6,-8,-6,34,0};
//        for (int i=0; i<range.length; i++){
//            if (range[i]==0){
//                for (int j=i; j<range.length-1; j++){
//                    range[j]=range[j+1];
//                    range[range.length-1]=0;
//                }
//            }
//        }
//        System.out.print("New massive: ");
//        for (int k=0; k<range.length; k++){
//            int element = range[k];
//            System.out.print(element+"; ");
//        }
//    }
//}
