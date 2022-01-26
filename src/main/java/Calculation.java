import java.util.Scanner;

public class Calculation {
    private static double rate;
    private static int answerActivity;
    private static int selfActivity;
    private static int questionfActivity;
    static Scanner scanner = new Scanner(System.in);
    //rate counting
    public static double countRate(){
        answerActivity = scanner.nextInt();
        selfActivity = scanner.nextInt();
        questionfActivity = scanner.nextInt();
        rate = (double)(answerActivity+selfActivity*2+questionfActivity*2)/3;
        return rate;
    }
}
