package Array;


import java.util.ArrayList;

public class Zoo {
    ArrayList<String> arrayList = new ArrayList<>();

    void add(){
        arrayList.add("elephant");
        arrayList.add("shark");
        arrayList.add("penguin");
        arrayList.add("cat");
        arrayList.add("dog");
        arrayList.add("lion");
        arrayList.add("tiger");
        arrayList.add("mouse");
    }

    void show(){
        for (String s: this.arrayList) {
            System.out.println(s);
        }
    }
}
