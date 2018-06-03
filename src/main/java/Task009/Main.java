package Task009;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void original () {
//        Key
        int proKey= 555;
        int exKey = 777;
        int freeKey = 1;

        Scanner in = new Scanner (System.in);
        System.out.print("input key: 1 free version:  " );
        int inputKey = in.nextInt();

        if (inputKey == proKey){
            ProDocumentWorker documentPro = new ProDocumentWorker();
            documentPro.editDocument();
            documentPro.saveDocument();
            System.out.println("Pro access");
        }else if (inputKey == exKey){
            ExpertDocumentWorker documentExpert = new ExpertDocumentWorker();
            documentExpert.saveDocument();
            System.out.println("Exp access");
        }else if (inputKey == freeKey){
            DocumentWorker document = new DocumentWorker();
            document.openDocument();
            document.editDocument();
            document.saveDocument();
            System.out.println("Free version");
        }else{
            System.err.println("Enter valid");
            original();
        }
        in.close();
    }

    public static void main(String[] args) {
        original();
    }
}
