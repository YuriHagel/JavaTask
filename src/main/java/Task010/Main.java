package Task010;



import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void choice() {
        Scanner st = new Scanner(System.in);

        AbstractHandler abstxt = new TXTHandler();
        AbstractHandler absXML = new XMLHandler();
        AbstractHandler absDOC = new DOCHandler();


        System.out.print("Введите формат документа(txt,xml,doc): ");
        String input = st.next();

        if (input.equals("txt")) {
            System.out.println("Вы выбрали формат TXT");
            Scanner in2 = new Scanner(System.in);
            System.out.print("Выберите операцию(open,save,change,create): ");
            String inputTXT = in2.next();
            if (inputTXT.equals("open")) {
                abstxt.open();
            }
            else if (inputTXT.equals("save")) {
                abstxt.save();
            }
            else if (inputTXT.equals("change")) {
                abstxt.change();
            }
            else if (inputTXT.equals("create")) {
                abstxt.create();
            } else {
               System.err.println("Вы ввели неверную команду, повторите.");
               choice();
               in2.close();

            }
        }
        if (input.equals("doc")) {
            System.out.println("Вы выбрали формат DOC");
            Scanner in3 = new Scanner(System.in);
            System.out.print("Выберите операцию(open,save,change,create): ");
            String inputDoc = in3.next();
            if (inputDoc.equals("open")) {
                absDOC.open();
            }
            else if (inputDoc.equals("save")) {
                absDOC.save();
            }
            else if (inputDoc.equals("change")) {
                absDOC.change();
            }
            else if (inputDoc.equals("create")) {
                absDOC.create();
            } else {
                System.err.println("Вы ввели неверную команду, повторите.");
                choice();
                in3.close();
            }


        }
        if (input.equals("xml")) {
            System.out.println("Вы выбрали формат XML");
            Scanner in4 = new Scanner(System.in);
            System.out.print("Выберите операцию(open,save,change,create): ");
            String inputXML = in4.next();
            if (inputXML.equals("open")) {
                absXML.open();
            }
            else if (inputXML.equals("save")) {
                absXML.save();
            }
            else if (inputXML.equals("change")) {
                absXML.change();
            }
            else if (inputXML.equals("create")) {
                absXML.create();
            } else {
                System.err.println("Вы ввели неверную команду, повторите.");
                choice();
                in4.close();
            }
        }
    }

    public static void main(String[] args)  {
        choice();
    }
}


