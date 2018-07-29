//package Calculator;
//
//import java.text.DecimalFormat;
//import java.util.Scanner;
//
//import static java.lang.Math.*;
//
//public class Calculator {
//    public enum mathTerm {
//        additional, subtraction, multiplication, division, power, normal
//    }
//    public enum shape {
//        square, squareRoot, cos, sin , tan, dividedByOne, coefficient, log
//    }
//    static Scanner scanner = new Scanner(System.in);
//    public double num1 , num2;
//    public double result;
//    public char operation;
//    private mathTerm term = mathTerm.normal;
//
//    public void double calculatateBi(){
//        if(term == mathTerm.normal){
//            num2 = getDouble();
//
//            num1 = getDouble();
//            operation = getOperation();
//
////            result = calculatateBi(num1, num2, operation);
//            String finalresult = new DecimalFormat("0.0000").format(result);
//            System.out.println("Результат операции: " + finalresult);
//        }
//    }
//    public static char getOperation(){
//        System.out.println("Введите операцию:");
//        char operation;
//        if(scanner.hasNext()== true){
//            operation = scanner.next().charAt(0);
//        } else {
//            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
//            scanner.next();//рекурсия
//            operation = getOperation();
//        }
//        return operation;
//    }
//
//    public double getDouble(){
//        System.out.println("Введите число:");
//        double num;
//        if (scanner.hasNextDouble()) {
//            num = scanner.nextDouble();
//
//        } else {
//            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
//            scanner.next();//рекурсия
//            num = getDouble();
//        }
//        return num;
//    }
//    public double calculateEqual(Double num) {
//        return calculateBi(mathTerm.normal, num);
//    }
//
//
//
//
//
//    public double calculateImpl(double num1, double num2 ) {
////        mathTerm term = mathTerm.power;
//        switch (term) {
//            case division:
//                result = num1 / num2;
//                break;
//            case additional:
//                result = num1 + num2;
//                break;
//            case multiplication:
//                result = num1 * num2;
//                break;
//            case subtraction:
//                result = num1 - num2;
//                break;
//            case power:
//                result = pow(num1, num2);
//                break;
//            default:
//                System.out.println("Операция не распознана. Повторите ввод.");
//                result = calculateImpl(double num1, double num2);
//        }
//        return result;
//    }
//        public double calculateMono(double num){
//            shape trigonometry = shape.coefficient;
//
//            switch (trigonometry) {
//                case coefficient:
//                    result = num / 100;
//                    break;
//                case cos:
//                    result = Math.cos(num);
//                    break;
//                case log:
//                    result = log10(num);
//                    break;
//                ;
//                case sin:
//                    result = Math.sin(num);
//                    break;
//                case tan:
//                    result = Math.tan(num);
//                    break;
//                case squareRoot:
//                    result = Math.sqrt(num);
//                    break;
//                default:
//                    result = calculateMono(double num);
//
//            }
//
//        }
//    }
//}
//
//
//
//
////        if(term == mathTerm.normal){
////            return num2;
////        }
////        if(term == mathTerm.subtraction){
////            return num1 - num2;
////        }
////        if(term == mathTerm.additional){
////            return num1 + num2;
////        }
////        if(term ==mathTerm.multiplication){
////            return num1 * num2;
////        }
////        if(term == mathTerm.division){
////            return num1 / num2;
////        }
////        if(term == mathTerm.power){
////            return pow (num1 , num2);
////        }
////        throw new Error();
////    }
////    public Double calculateBi(mathTerm newTerm , Double num){
////        if(term == mathTerm.normal){
////            num2 = 0.0;
////            num1 = num;
////            term = newTerm;
////            return Double.NaN;
////        }else {
////            num2 = num;
////            num1 = calculateImpl();
////            term = newTerm;
////            return num;
////        }
////    }
////    public Double calculateEqual(Double num){
////        return calculateBi(mathTerm.normal, num);
////    }
////    public Double reset(){
////        num2 = 0.0;
////        num1 = 0.0;
////        term = mathTerm.normal;
////        return Double.NaN;
////    }
////    public Double calculateMono(shape newTerm, Double num){
////        if(newTerm == shape.square){
////            return num * num;
////        }
////        if(newTerm == shape.squareRoot){
////            return Math.sqrt(num);
////        }
////        if(newTerm == shape.coefficient){
////            return num / 100;
////        }
////        if(newTerm == shape.cos){
////            return Math.cos(num);
////        }
////        if(newTerm == shape.dividedByOne){
////            return 1 / num;
////        }
////        if(newTerm == shape.sin){
////            return Math.sin(num);
////        }
////        if(newTerm == shape.tan){
////            return Math.tan(num);
////        }
////        if(newTerm == shape.log){
////            return log10(num);
////        }
////        throw new Error();
////
////
////    }
////
////}
