package Array02.String;

public class Main {
    public static void main(String[] args) {
        String line = "This is just a test and nothing else";
        String lowerLine = line.toLowerCase();//к нижнему регистру
        StringBuffer notOnlyLetters = new StringBuffer(lowerLine);//строка с лишними символами
        StringBuffer onlyLettersWithSpace = new StringBuffer();//строка только из букв и заданного количества пробелов
        StringBuffer onlyLetters = new StringBuffer();//строка только с буквами в нижнем регистре

        for (int i=0; i< notOnlyLetters.length(); i++){
            if (Character.isLetter(notOnlyLetters.charAt(i))){
                onlyLettersWithSpace.append(notOnlyLetters.charAt(i)).append("  ");
                onlyLetters.append(notOnlyLetters.charAt(i));
            }
        }
        String newLineNoSpace = onlyLetters.toString().trim();//новая строка только с символами
        String newLineWithSpace = onlyLettersWithSpace.toString().trim();//новая строка с пробелами
        byte byteMassive[] = newLineNoSpace.getBytes();//преобразуем строку в массив байтов
        for (int i=0; i<byteMassive.length; i++){
            byteMassive[i]-=96;//определяем порядковый номер буквы в алфавите
        }
        StringBuffer alphabet = new StringBuffer();//новая строка с порядковыми номерами букв
        for (int i=0; i<newLineNoSpace.length(); i++){
            alphabet.append(byteMassive[i]).append("  ");
        }
        System.out.println(newLineWithSpace);
        System.out.println(alphabet);//вывод на экран порядкового номера в алфавите
    }

}
