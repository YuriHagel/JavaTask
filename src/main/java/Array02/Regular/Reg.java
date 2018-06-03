package Array02.Regular;

public class Reg { //удаление слов начинающихся на согласную длиной в 5 знаков
    public static void main(String[] args) {
        String line = "This is just a test and nothing else";
        System.out.println("Исходный текст:"+line);

        int numberOfLetters = 5;

        String [] words = line.split(" "); //Разделяет строку на слова
        StringBuilder newLine = new StringBuilder();
        for (String i:words){
            if((isVowel(i.charAt(0))&&(i.length()!=numberOfLetters))){
                newLine.append(i).append(" ");
            }
        }
        String result = newLine.toString().trim();
        System.out.println(result);
    }
    public static boolean isVowel (char a) {
        switch (Character.toLowerCase(a)){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
                return true;
            default:
                return false;
        }
    }
}
