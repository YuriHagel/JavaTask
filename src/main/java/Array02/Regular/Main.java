package Array02.Regular;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        String line = "This1 is4 jus$t a t5est an&d not#hing e)lse";
        StringBuffer newLine = new StringBuffer();
        for (int i=0; i<line.length(); i++){


          Pattern  pat = Pattern.compile("[a-zA-Z\\s]+");
           Matcher mat = pat.matcher(Character.toString(line.charAt(i)));
           boolean found = mat.matches();
            if(found){
                newLine.append(line.charAt(i));
            }
        }
        System.out.println(newLine);

    }
}
