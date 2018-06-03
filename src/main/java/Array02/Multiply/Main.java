package Array02.Multiply;

public class Main {
    public static void main(String[] args) { // перемножение всех элементов до первого нуля без усложенений типа если в массиве нет нулей
        int range[]={1,2,7,0,11,0,-8,5,3,2,6,-8,-6,34,0};
        //int firstZero = 0;
        int firstZeroIndex = 0;
        int result=1;
        for (int i=0; i<range.length; i++){
            if (range[i]==0){
                //firstZero=i;
                firstZeroIndex = i;
                break;
            }
        }
        for (int j=0; j<firstZeroIndex; j++){
            result *= range[j];
        }

        System.out.println("The index of the first zero is "+firstZeroIndex);
        System.out.println("The multiplication result is "+result);
    }
}
