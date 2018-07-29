//package Calculator;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class JavaCalculator implements ActionListener {
//    private final JFrame frame;
//    private final JPanel panel;
//    private final JTextArea text;
//    private final JButton but[], butAdd, butMinus, butMultiply, butDivide,
//            butEqual, butCancel, butSquareRoot, butSquare, butDividedByOne,
//            butCos, butSin, butTan, butPoint, butxpowerofy, butlog, butrate;
//    private final Calculator calc;
//    private final String[] buttonValue = { "0", "1", "2", "3", "4", "5", "6",
//            "7", "8", "9" };
//
//    public JavaCalculator() {
//        frame = new JFrame("Calculator PH");
//        frame.setResizable(false);
//        panel = new JPanel(new FlowLayout());
//
//        text = new JTextArea(2, 25);
//        but = new JButton[10];
//        for (int i = 0; i < 10; i++) {
//            but[i] = new JButton(String.valueOf(i));
//        }
//        butAdd = new JButton("+");
//        butMinus = new JButton("-");
//        butMultiply = new JButton("*");
//        butDivide = new JButton("/");
//        butEqual = new JButton("=");
//        butSquareRoot = new JButton("√");
//        butSquare = new JButton("x*x");
//        butDividedByOne = new JButton("1/x");
//        butCos = new JButton("Cos");
//        butSin = new JButton("Sin");
//        butTan = new JButton("Tan");
//        butxpowerofy = new JButton("x^y");
//        butlog = new JButton("log10(x)");
//        butrate = new JButton("x%");
//        butPoint = new JButton(".");
//
//        butCancel = new JButton("C");
//
//        calc = new Calculator();
//    }
//    public void init() {
//        frame.setVisible(true);
//        frame.setSize(330, 300);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.add(panel);
//
//        panel.add(text);
//
//        for (int i = 1; i < 10; i++) {
//            panel.add(but[i]);
//            but[i].addActionListener(this);
//        }
//        panel.add(but[0]);
//
//        panel.add(butAdd);
//        panel.add(butMinus);
//        panel.add(butMultiply);
//        panel.add(butDivide);
//        panel.add(butSquare);
//        panel.add(butSquareRoot);
//        panel.add(butDividedByOne);
//        panel.add(butCos);
//        panel.add(butSin);
//        panel.add(butTan);
//        panel.add(butxpowerofy);
//        panel.add(butlog);
//        panel.add(butrate);
//        panel.add(butPoint);
//
//        panel.add(butEqual);
//        panel.add(butCancel);
//
//        butAdd.addActionListener(this);
//        butMinus.addActionListener(this);
//        butMultiply.addActionListener(this);
//        butDivide.addActionListener(this);
//        butSquare.addActionListener(this);
//        butSquareRoot.addActionListener(this);
//        butDividedByOne.addActionListener(this);
//        butPoint.addActionListener(this);
//        butCos.addActionListener(this);
//        butSin.addActionListener(this);
//        butTan.addActionListener(this);
//        butxpowerofy.addActionListener(this);
//        butlog.addActionListener(this);
//        butrate.addActionListener(this);
//
//        butEqual.addActionListener(this);
//        butCancel.addActionListener(this);
//    }
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        final Object source = e.getSource();
//
//        for (int i = 0; i < 10; i++) {
//            if (source == but[i]) {
//                text.replaceSelection(buttonValue[i]);
//                return;
//            }
//        }
//
//        if (source == butAdd) {
//            writer(calc.calculateBi(Calculator.mathTerm.additional, reader()));
//        }
//
//        if (source == butMinus) {
//            writer(calc.calculateBi(Calculator.mathTerm.subtraction, reader()));
//        }
//
//        if (source == butMultiply) {
//            writer(calc.calculateBi(Calculator.mathTerm.multiplication,
//                    reader()));
//        }
//
//        if (source == butDivide) {
//            writer(calc
//                    .calculateBi(Calculator.mathTerm.division, reader()));
//        }
//        if (source == butxpowerofy) {
//            writer(calc
//                    .calculateBi(Calculator.mathTerm.power, reader()));
//        }
//
//        if (source == butSquare) {
//            writer(calc.calculateMono(Calculator.shape.square,
//                    reader()));
//        }
//
//        if (source == butSquareRoot) {
//            writer(calc.calculateMono(Calculator.shape.squareRoot,
//                    reader()));
//        }
//
//        if (source == butDividedByOne) {
//            writer(calc.calculateMono(
//                    Calculator.shape.dividedByOne, reader()));
//        }
//
//        if (source == butCos) {
//            writer(calc.calculateMono(Calculator.shape.cos,
//                    reader()));
//        }
//
//        if (source == butSin) {
//            writer(calc.calculateMono(Calculator.shape.sin,
//                    reader()));
//        }
//
//        if (source == butTan) {
//            writer(calc.calculateMono(Calculator.shape.tan,
//                    reader()));
//        }
//        if (source == butlog) {
//            writer(calc.calculateMono(Calculator.shape.log,
//                    reader()));
//        }
//        if (source == butrate) {
//            writer(calc.calculateMono(Calculator.shape.coefficient,
//                    reader()));
//        }
//
//        if (source == butEqual) {
//            writer(calc.calculateEqual(reader()));
//        }
//
//        if (source == butCancel) {
//            writer(calc.reset());
//        }
//
//        text.selectAll();
//    }
//
//    public Double reader() {
//        Double num;
//        String str;
//        str = text.getText();
//        num = Double.valueOf(str);
//
//        return num;
//    }
//
//    public void writer(final Double num) {
//        if (Double.isNaN(num)) {
//            text.setText("");
//        } else {
//            text.setText(Double.toString(num));
//        }
//    }
//}