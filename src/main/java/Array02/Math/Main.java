package Array02.Math;

public class Main {  //вывод элементов массива и расчет среднего арифметического
    public static void main(String[] args) {
        float range[] = {2.5F,1.7F,1.1F,4.6F,6.7F,8.5F,5.7F,9.3F,8.4F,5.9F};
        for (int i=0; i <= range.length-1;i++){
            System.out.format("%.1f |",range[i]);
        }
        System.out.print("average value=");
        float sum=0;
        for(int b=0; b <= range.length-1;b++){
            sum=sum+range[b];
        }
        float quantity = range.length;
        float average = sum/quantity;
        System.out.format("%.2f",average);
    }
}
