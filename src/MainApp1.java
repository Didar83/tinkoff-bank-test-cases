import java.util.Scanner;

public class MainApp1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        StringBuilder sb = new StringBuilder("");
        int iterateNum;
        if (firstNumber == secondNumber || firstNumber < secondNumber){
            iterateNum = firstNumber;
        } else {
            iterateNum = secondNumber;
        }

        for (int i = 0; i < iterateNum; i++){
            sb.append("XY");
            System.out.println(sb);
        }
        System.out.println(sb.length());
    }
}
