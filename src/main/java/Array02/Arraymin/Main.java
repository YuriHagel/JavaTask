package Array02.Arraymin;

public class Main { //определение минимального числа из диапазона и его индекса
    public static void main(String[] args) {
        int range[]={1,4,6,3,11,6,8,5,3,2,6,8,6,34,0};
        int min = range[0];
        int indexMin = 0;
        for (int i=0; i<range.length; i++){
            for (int j = i+1; j<range.length; j++){
                if (range[j]<min){
                    min=range[j];
                    indexMin=j;
                }
            }
        }
        System.out.println(min);
        System.out.println(indexMin);
    }
}
