/*
Padhraig Izediuno
May 1st, 2024
COMP167
Description: this programming is a scientific calculator that is created in java Swing and can do calculations
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculating extends JFrame implements ActionListener {
    //these are all my JButtons, TextField, String, and int. they are all privated and changed using the actionlistner
    private JButton button;
    private JButton number2;
    private JButton number3;
    private JButton number4;
    private JButton number5;
    private JButton number6;
    private JButton number7;
    private JButton number8;
    private JButton number9;
    private JButton number0;
    private JButton decmialSign;
    private JButton plusSign;
    private JButton minusSign;
    private JButton mutilpy;
    private JButton divison;
    private JButton equal;
    private JButton plusAndNegative;
    private JButton clear;
    private JButton sin;
    private JButton cos;
    private JButton tan;
    private JButton log;
    private JButton ln;
    private JButton asin;
    private JButton acos;
    private JButton atan;
    private JButton powerOfTen;
    private JButton absloute;
    private JButton sinh;
    private JButton cosh;
    private JButton tanh;
    private JButton exit;

    private JButton powerOfTwo;
    private JButton powerOfThree;
    private JButton mod;
    private JButton oneDivn;
    private JButton percent;

    private JButton squareRoot;








    private JTextField text;
    private JTextField inputText;

    private String firstInput = "";
    private String secondInput ="";
    private Double numberOutput;

    private String output;

    private String inputString = "";

    private Double firstNumber;
    private Double secondNumber;

    private int count = 0;

    private int type;

    private int decider = 0;

    private int editable = 0;


    //This is my constructor that makes the frame and adds all of the buttons and textfields to the frame.
    Calculating() {
        button = new JButton("1");
        button.setBounds(40, 100, 100, 50);
        button.addActionListener(this);

        number2 = new JButton("2");
        number2.setBounds(140, 100, 100, 50);
        number2.addActionListener(this);

        number3 = new JButton("3");
        number3.setBounds(240, 100, 100, 50);
        number3.addActionListener(this);

        number4 = new JButton("4");
        number4.setBounds(40, 150, 100, 50);
        number4.addActionListener(this);

        number5 = new JButton("5");
        number5.setBounds(140, 150, 100, 50);
        number5.addActionListener(this);

        number6 = new JButton("6");
        number6.setBounds(240, 150, 100, 50);
        number6.addActionListener(this);

        number7 = new JButton("7");
        number7.setBounds(40, 200, 100, 50);
        number7.addActionListener(this);

        number8 = new JButton("8");
        number8.setBounds(140, 200, 100, 50);
        number8.addActionListener(this);

        number9 = new JButton("9");
        number9.setBounds(240, 200, 100, 50);
        number9.addActionListener(this);

        number0 = new JButton("0");
        number0.setBounds(40, 250, 100, 50);
        number0.addActionListener(this);

        decmialSign = new JButton(".");
        decmialSign.setBounds(140, 250, 100, 50);
        decmialSign.addActionListener(this);

        mutilpy = new JButton("*");
        mutilpy.setBounds(340, 100, 75, 50);
        mutilpy.addActionListener(this);

        divison = new JButton("/");
        divison.setBounds(415, 100, 75, 50);
        divison.addActionListener(this);

        plusSign = new JButton("+");
        plusSign.setBounds(340,150,75,50);
        plusSign.addActionListener(this);

        minusSign = new JButton("-");
        minusSign.setBounds(415,150,75,50);
        minusSign.addActionListener(this);

        plusAndNegative = new JButton("±");
        plusAndNegative.setBounds(240, 250, 100, 50);
        plusAndNegative.addActionListener(this);

        clear = new JButton("C/CC");
        clear.setBounds(490, 100, 75, 50);
        clear.addActionListener(this);


        equal = new JButton("=");
        equal.setBounds(340,200,150,50);
        equal.addActionListener(this);

        sin = new JButton("sin");
        sin.setBounds(40, 350, 75, 50);
        sin.addActionListener(this);

        cos = new JButton("cos");
        cos.setBounds(115, 350, 75, 50);
        cos.addActionListener(this);

        tan = new JButton("tan");
        tan.setBounds(190, 350, 75, 50);
        tan.addActionListener(this);

        log = new JButton("log");
        log.setBounds(265, 350, 75, 50);
        log.addActionListener(this);

        ln = new JButton("ln");
        ln.setBounds(340, 350, 75, 50);
        ln.addActionListener(this);

        asin = new JButton("asin");
        asin.setBounds(40, 400, 75, 50);
        asin.addActionListener(this);

        acos = new JButton("acos");
        acos.setBounds(115, 400, 75, 50);
        acos.addActionListener(this);

        atan = new JButton("atan");
        atan.setBounds(190, 400, 75, 50);
        atan.addActionListener(this);

        powerOfTen = new JButton("10^n");
        powerOfTen.setBounds(265, 400, 75, 50);
        powerOfTen.addActionListener(this);

        absloute = new JButton("abs");
        absloute.setBounds(340, 400, 75, 50);
        absloute.addActionListener(this);

        sinh = new JButton("sinh");
        sinh.setBounds(40, 450, 75, 50);
        sinh.addActionListener(this);

        cosh = new JButton("cosh");
        cosh.setBounds(115, 450, 75, 50);
        cosh.addActionListener(this);

        tanh = new JButton("tanh");
        tanh.setBounds(190, 450, 75, 50);
        tanh.addActionListener(this);

        exit = new JButton("exit");
        exit.setBounds(265, 450, 150, 50);
        exit.addActionListener(this);

        powerOfTwo = new JButton("x^2");
        powerOfTwo.setBounds(340,250,75,50);
        powerOfTwo.addActionListener(this);

        powerOfThree = new JButton("x^3");
        powerOfThree.setBounds(415,250,75,50);
        powerOfThree.addActionListener(this);

        squareRoot = new JButton("√");
        squareRoot.setBounds(40, 300, 75, 50);
        squareRoot.addActionListener(this);

        percent = new JButton("%");
        percent.setBounds(115, 300, 75, 50);
        percent.addActionListener(this);

        oneDivn = new JButton("1/n");
        oneDivn.setBounds(190, 300, 75, 50);
        oneDivn.addActionListener(this);

        mod = new JButton("Mod");
        mod.setBounds(265, 300, 75, 50);
        mod.addActionListener(this);

        text = new JTextField();

        text.setBackground(Color.green);
        text.setVisible(true);
        text.setBounds(40, 0, 525,50);
        text.setEditable(false);
        text.setHorizontalAlignment(SwingConstants.RIGHT);

        inputText = new JTextField();
        inputText.setBounds(40, 50, 525,50);
        inputText.setBackground(Color.green);
        inputText.setVisible(true);
        inputText.setEditable(false);
        inputText.setHorizontalAlignment(SwingConstants.LEFT);








        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(600, 550);
        this.setResizable(false);
        this.setVisible(true);
//        this.pack();
        this.add(button);
        this.add(number2);
        this.add(number3);
        this.add(number4);
        this.add(number5);
        this.add(number6);
        this.add(number7);
        this.add(number8);
        this.add(number9);
        this.add(number0);
        this.add(text);
        this.add(decmialSign);
        this.add(mutilpy);
        this.add(divison);
        this.add(plusSign);
        this.add(minusSign);
        this.add(equal);
        this.add(plusAndNegative);
        this.add(clear);
        this.add(sin);
        this.add(cos);
        this.add(tan);
        this.add(log);
        this.add(ln);
        this.add(asin);
        this.add(acos);
        this.add(atan);
        this.add(powerOfTen);
        this.add(absloute);
        this.add(sinh);
        this.add(cosh);
        this.add(tanh);
        this.add(exit);
        this.add(powerOfTwo);
        this.add(powerOfThree);
        this.add(squareRoot);
        this.add(oneDivn);
        this.add(percent);
        this.add(mod);
        this.add(inputText);
        this.getContentPane().setBackground(new Color(169,169,169));






        this.getContentPane().add(text, BorderLayout.CENTER);




    }
    //this is my actionListener and it adds functionality to the buttons and allows the textfields to be changed and gives order to the calculator (permits the calculator doing things it not suppose to be able to do).

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            if (count == 0) {
                if (editable ==0) {
                    firstInput += "1";
                }
                text.setText(firstInput);
            } else {
                secondInput += "1";
                text.setText(secondInput);
            }

        }
        else if (e.getSource()== exit){
            this.dispose();
        }
        else if (e.getSource() == number2) {
            System.out.println("hey");
            if (count == 0) {
                if (editable ==0) {
                    firstInput += "2";
                }
                text.setText(firstInput);
            } else {
                secondInput += "2";
                text.setText(secondInput);
            }
        } else if (e.getSource() == number3) {
            if (count == 0) {
                if (editable ==0) {
                    firstInput += "3";
                }
                text.setText(firstInput);
            } else {
                secondInput += "3";
                text.setText(secondInput);
            }
        } else if (e.getSource() == number4) {
            if (count == 0) {
                if (editable ==0) {
                    firstInput += "4";
                }
                text.setText(firstInput);
            } else {
                secondInput += "4";
                text.setText(secondInput);
            }
        } else if (e.getSource() == number5) {
            if (count == 0) {
                if (editable ==0) {
                    firstInput += "5";
                }
                text.setText(firstInput);
            } else {
                secondInput += "5";
                text.setText(secondInput);
            }
        } else if (e.getSource() == number6) {
            if (count == 0) {
                if (editable ==0) {
                    firstInput += "6";
                }
                text.setText(firstInput);
            } else {
                secondInput += "6";
                text.setText(secondInput);
            }
        } else if (e.getSource() == number7) {
            if (count == 0) {
                if (editable ==0) {
                    firstInput += "7";
                }
                text.setText(firstInput);
            } else {
                secondInput += "7";
                text.setText(secondInput);
            }
        } else if (e.getSource() == number8) {
            if (count == 0) {
                if (editable ==0) {
                    firstInput += "8";
                }
                text.setText(firstInput);
            } else {
                secondInput += "8";
                text.setText(secondInput);
            }
        } else if (e.getSource() == number9) {
            if (count == 0) {
                if (editable ==0) {
                    firstInput += "9";
                }
                text.setText(firstInput);
            } else {
                secondInput += "9";
                text.setText(secondInput);
            }
        } else if (e.getSource() == number0) {
            if (count == 0) {
                if (editable ==0) {
                    firstInput += "0";
                }
                text.setText(firstInput);
            } else {
                secondInput += "0";
                text.setText(secondInput);
            }
        } else if (e.getSource() == decmialSign) {
            if (count == 0) {
                firstInput += ".";
                text.setText(firstInput);
                decmialSign.setEnabled(false);

            } else {
                secondInput += ".";
                text.setText(secondInput);
                decmialSign.setEnabled(false);

            }
        } else if (e.getSource() == plusAndNegative) {
            if (count == 0) {

                if (firstInput.contains("-")) {
                    firstInput = firstInput.replace("-", "");
                    text.setText(firstInput);
                } else {
                    if (editable ==0) {
                        firstInput = "-" + firstInput;
                    }
                    text.setText(firstInput);
                }
            } else {

                if (secondInput.contains("-")) {
                    if (editable ==0) {
                        secondInput = secondInput.replace("-", "");
                        text.setText(secondInput);
                    }
                } else {
                    if (editable ==0) {
                        secondInput = "-" + secondInput;
                        text.setText(secondInput);
                    }
                }
            }
        } else if (e.getSource() == clear) {
            if (count == 0) {
                firstInput = "";
                text.setText(firstInput);
                decmialSign.setEnabled(true);
                inputString ="";
                inputText.setText(inputString);
                editable =0;
            } else {
                secondInput = "";
                count = 0;
                text.setText(firstInput);
                editable = 1;
            }
//
        } else if (e.getSource() == mutilpy) {
            count = 1;
            type = 0;
            text.setText(secondInput);
            decmialSign.setEnabled(true);
            if (decider ==0) {
                inputString += firstInput;
                inputString += " * ";
                inputText.setText(inputString);
            }
            decider =1;
            editable =0;

        } else if (e.getSource() == divison) {
            count = 1;
            type = 1;
            text.setText(secondInput);
            decmialSign.setEnabled(true);
            if (decider ==0) {
                inputString += firstInput;
                inputString += " / ";
                inputText.setText(inputString);
            }
            decider = 1;
            editable = 0;

        } else if (e.getSource() == mod) {
            count = 1;
            type = 4;
            text.setText(secondInput);
            decmialSign.setEnabled(true);
            if(decider ==0) {
                inputString += firstInput;
                inputString += " % ";
                inputText.setText(inputString);
            }
            decider =1;
            editable = 0;


        }
        else if (e.getSource() == powerOfTen) {
            count = 1;
            type = 5;
            text.setText(secondInput);
            decmialSign.setEnabled(true);
            if (decider ==0){
            inputString += firstInput;
            inputString += " * 10^";
            inputText.setText(inputString);
            }
            decider = 1;
            editable = 0;

        }
        else if (e.getSource() == minusSign) {
            count = 1;
            type = 2;
            text.setText(secondInput);
            decmialSign.setEnabled(true);
            if(decider ==0) {
                inputString += firstInput;
                inputString += " - ";
                inputText.setText(inputString);
            }

            decider =1;
            editable = 0;

        } else if (e.getSource() == plusSign) {
            count = 1;
            type = 3;
            text.setText(secondInput);
            decmialSign.setEnabled(true);
            if(decider ==0) {
                inputString += firstInput;
                inputString += " + ";
                inputText.setText(inputString);
            }
            decider = 1;
            editable = 0;

        } else if (e.getSource() == equal) {
            firstNumber = Double.parseDouble(firstInput);
            secondNumber = Double.parseDouble(secondInput);
            if (type == 0) {
                numberOutput = firstNumber * secondNumber;
                firstInput = Double.toString(numberOutput);
                text.setText(firstInput);
            } else if (type == 1) {

                numberOutput = firstNumber / secondNumber;
                firstInput = Double.toString(numberOutput);
                text.setText(firstInput);

            }

         else if (type == 2) {
            numberOutput = firstNumber - secondNumber;
            firstInput = Double.toString(numberOutput);
            text.setText(firstInput);
        } else if (type == 3) {
            numberOutput = firstNumber + secondNumber;
            firstInput = Double.toString(numberOutput);
            text.setText(firstInput);
        } else if (type == 4) {
            firstNumber = Double.parseDouble(firstInput);
            secondNumber = Double.parseDouble(secondInput);
            firstNumber = modulo(firstNumber, secondNumber);
            firstInput = Double.toString(firstNumber);
            text.setText(firstInput);
        }
         else if (type == 5) {
                firstNumber = Double.parseDouble(firstInput);
                secondNumber = Double.parseDouble(secondInput);
                firstNumber = powerOfTenMethod(firstNumber, secondNumber);
                firstInput = Double.toString(firstNumber);
                text.setText(firstInput);
            }
        if (firstInput.contains(".")) {
            decmialSign.setEnabled(false);
        }


        count = 0;
        inputString += secondInput;
        inputString += " = ";
        inputText.setText(inputString);
        secondInput = "";
        inputText.setText(inputString);
        decider =0;
        editable = 1;


    }
        else if (e.getSource() == powerOfTwo){
            firstNumber = Double.parseDouble(firstInput);
            firstNumber = power2(firstNumber);
            inputString += firstInput + "^2 = ";
            inputText.setText(inputString);
            firstInput = Double.toString(firstNumber);
            text.setText(firstInput);
            editable = 1;

        }
        else if(e.getSource() == powerOfThree) {
            firstNumber = Double.parseDouble(firstInput);
            firstNumber = power3(firstNumber);
            inputString += firstInput + "^3 = ";
            inputText.setText(inputString);
            firstInput = Double.toString(firstNumber);
            text.setText(firstInput);
            editable = 1;
        }
        else if(e.getSource() == log) {
            firstNumber = Double.parseDouble(firstInput);
            firstNumber = logarithm(firstNumber);
            inputString += "Log("+firstInput + ") = ";
            inputText.setText(inputString);
            firstInput = Double.toString(firstNumber);
            text.setText(firstInput);
            editable = 1;
        }
        else if (e.getSource()== exit){
            this.dispose();
        }
        else if(e.getSource() == squareRoot) {
            firstNumber = Double.parseDouble(firstInput);
            firstNumber = squareRoots(firstNumber);
            inputString += "√ " + firstInput + " = ";
            inputText.setText(inputString);
            firstInput = Double.toString(firstNumber);
            text.setText(firstInput);
            editable = 1;
        }
        else if(e.getSource() == sin) {
            firstNumber = Double.parseDouble(firstInput);
            firstNumber = sinMethod(firstNumber);
            inputString += "sin(" + firstInput + ") = ";
            inputText.setText(inputString);
            firstInput = Double.toString(firstNumber);
            text.setText(firstInput);
            editable = 1;
        }
        else if(e.getSource() == cos) {
            firstNumber = Double.parseDouble(firstInput);
            firstNumber = cosMethod(firstNumber);
            inputString += "cos(" + firstInput + ") = ";
            inputText.setText(inputString);
            firstInput = Double.toString(firstNumber);
            text.setText(firstInput);
            editable = 1;
        }
        else if(e.getSource() == tan) {
            firstNumber = Double.parseDouble(firstInput);
            firstNumber = tanMethod(firstNumber);
            inputString += "tan(" + firstInput + ") = ";
            inputText.setText(inputString);
            firstInput = Double.toString(firstNumber);
            text.setText(firstInput);
            editable = 1;
        }
        else if(e.getSource() == ln) {
            firstNumber = Double.parseDouble(firstInput);
            firstNumber = lnMethod(firstNumber);
            inputString += "ln(" + firstInput + ") = ";
            inputText.setText(inputString);
            firstInput = Double.toString(firstNumber);
            text.setText(firstInput);
            editable = 1;
        }
        else if(e.getSource() == asin) {
            firstNumber = Double.parseDouble(firstInput);
            firstNumber = asinMethod(firstNumber);
            inputString += "asin(" + firstInput + ") = ";
            inputText.setText(inputString);
            firstInput = Double.toString(firstNumber);
            text.setText(firstInput);
            editable = 1;
        }
        else if(e.getSource() == acos) {
            firstNumber = Double.parseDouble(firstInput);
            firstNumber = acosMethod(firstNumber);
            inputString += "acos(" + firstInput + ") = ";
            inputText.setText(inputString);
            firstInput = Double.toString(firstNumber);
            text.setText(firstInput);
            editable = 1;
        }
        else if(e.getSource() == atan) {
            firstNumber = Double.parseDouble(firstInput);
            firstNumber = atanMethod(firstNumber);
            inputString += "atan(" + firstInput + ") = ";
            inputText.setText(inputString);
            firstInput = Double.toString(firstNumber);
            text.setText(firstInput);
            editable = 1;
        }

        else if(e.getSource() == absloute) {
            firstNumber = Double.parseDouble(firstInput);
            firstNumber = absMethod(firstNumber);
            inputString += "|" + firstInput + "| = ";
            inputText.setText(inputString);
            firstInput = Double.toString(firstNumber);
            text.setText(firstInput);
            editable = 1;
        }
        else if(e.getSource() == sinh) {
            firstNumber = Double.parseDouble(firstInput);
            firstNumber = sinhMethod(firstNumber);
            inputString += "sinh(" + firstInput + ") = ";
            inputText.setText(inputString);
            firstInput = Double.toString(firstNumber);
            text.setText(firstInput);
            editable = 1;
        }
        else if(e.getSource() == cosh) {
            firstNumber = Double.parseDouble(firstInput);
            firstNumber = coshMethod(firstNumber);
            inputString += "cosh(" + firstInput + ") = ";
            inputText.setText(inputString);
            firstInput = Double.toString(firstNumber);
            text.setText(firstInput);
            editable = 1;
        }
        else if(e.getSource() == tanh) {
            firstNumber = Double.parseDouble(firstInput);
            firstNumber = tanhMethod(firstNumber);
            inputString += "tanh(" + firstInput + ") = ";
            inputText.setText(inputString);
            firstInput = Double.toString(firstNumber);
            text.setText(firstInput);
            editable = 1;
        }
        else if(e.getSource() == percent) {
            firstNumber = Double.parseDouble(firstInput);
            firstNumber = percentMethod(firstNumber);
            inputString += firstInput + " / 100 ";
            inputText.setText(inputString);
            firstInput = Double.toString(firstNumber);
            text.setText(firstInput);
            editable = 1;
        }
        else if(e.getSource() == oneDivn) {
            firstNumber = Double.parseDouble(firstInput);
            firstNumber = onedivnMethod(firstNumber);
            inputString += "1 / " + firstInput + " = ";
            inputText.setText(inputString);
            firstInput = Double.toString(firstNumber);
            text.setText(firstInput);
            editable = 1;
        }




    }
    //These are the methods that different math calcuations like trignometry calculation and logarithmic calculation.
    public Double power2(Double x){
        x = x * x;
        return x;
    }
    public Double power3(Double x){
        x = x * x * x;
        return x;
    }
    public Double sinMethod(Double num){
        Double output = Math.sin(num);
        return output;
    }
    public Double logarithm(Double num){
        num = Math.log10(num);
        return num;
    }
    public Double squareRoots(Double num){
        num = Math.sqrt(num);
        return num;
    }
    public Double modulo(Double num, Double num2){
        Double output = num % num2;
        return output;
    }
    public Double cosMethod(Double num){
        return Math.cos(num);
    }
    public Double tanMethod(Double num){
        return Math.tan(num);
    }
    public Double lnMethod(Double num){
        return Math.log(num);
    }
    public Double asinMethod(Double num){
        return Math.asin(num);
    }
    public Double acosMethod(Double num){
        return Math.acos(num);
    }
    public Double atanMethod(Double num){
        return Math.atan(num);
    }
    public Double powerOfTenMethod(Double num2,Double num){

        return num2 * (Math.pow(10, num));
    }
    public Double absMethod(Double num){
        return Math.abs(num);
    }
    public Double sinhMethod(Double num){
        return Math.sinh(num);
    }
    public Double coshMethod(Double num){
        return Math.cosh(num);
    }
    public Double tanhMethod(Double num){
        return Math.tanh(num);
    }
    public Double percentMethod(Double num){
        return num / 100;
    }
    public Double onedivnMethod(Double num){
        num = 1 / num;
        return num;
    }

    public static void main(String[] args) {
        Calculating frame = new Calculating();
    }
}