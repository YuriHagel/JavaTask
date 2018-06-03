package Array02.Iterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class Change {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        ListIterator here =  list.listIterator();
        while(here.hasNext()){
            System.out.print(here.next() + " ");
        }
        System.out.println("\n");

        while(here.hasPrevious()){
            System.out.print(here.previous() + " ");

        }



    }
}
