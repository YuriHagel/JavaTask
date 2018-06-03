package Array02.Arraynegative;

public class Main {
    public static void main(String[] args) { // определение количесчтва отрицательных значений в массиве
        int range[]={-1,4,6,-3,11,6,-8,5,3,2,6,-8,-6,34,0};
        int negative = 0;
        for (int i=0; i<range.length; i++){
            if (range[i]<0){
                negative++;
            }
        }
        System.out.println("There are "+negative+" negative number(s)");
    }
}
