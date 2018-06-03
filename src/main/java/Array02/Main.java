package Array02;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);

        ListIterator iterator = list.listIterator();
        while (iterator.hasNext()){
            list.set(iterator.nextIndex(), list.get(iterator.nextIndex()) + 1);
            iterator.next();
        }

        System.out.println(list);
    }
}
