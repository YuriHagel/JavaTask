package Array02.Iterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class Swapp {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        ListIterator  i =  list.listIterator();
        for(; i.hasNext() ;){
            System.out.print(i.next() + " ");
        }
        System.out.println("\n");

        for(; i.hasPrevious() ;){
            System.out.print(i.previous() + " ");

        }



    }
}
