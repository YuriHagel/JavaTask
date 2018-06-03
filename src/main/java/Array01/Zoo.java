package Array01;

import java.util.ArrayList;

public class Zoo {
    ArrayList<String> arrayList = new ArrayList<>();

    void add(){
        arrayList.add("elephnt");
        arrayList.add("shark");
        arrayList.add("penguin");
        arrayList.add("cat");
        arrayList.add("dog");
        arrayList.add("lion");
        arrayList.add("tiger");
        arrayList.add("mouse");
        System.out.println("Size " + arrayList.size());
    }

    void show(){
        for (String s: this.arrayList) {
            System.out.println(s);
        }
    }

    void delete(){
        this.arrayList.remove(7);
        this.arrayList.remove(5);
        this.arrayList.remove(3);
        System.out.println("Size " + arrayList.size());
    }
}
