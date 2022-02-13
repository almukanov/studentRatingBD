package ru.almukanov;

import java.text.DecimalFormat;
import java.util.Scanner;
/*
Rate calculation
 */
public class Calculation {
    private static double rate;
    private static int answerActivity;
    private static int selfActivity;
    private static int questionfActivity;
    private static final String DIGIT_PATTERN = "#0.00";
    static Scanner scanner = new Scanner(System.in);
    //rate counting
    public static double countRate(){
        answerActivity = scanner.nextInt();
        selfActivity = scanner.nextInt();
        questionfActivity = scanner.nextInt();
        rate = (double)(answerActivity+selfActivity*2+questionfActivity*2)/3;
        rate = Double.parseDouble(new DecimalFormat(DIGIT_PATTERN).format(rate));
        return rate;
    }
}
