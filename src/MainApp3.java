import java.util.*;

public class MainApp3 {
    public static void main(String[] args) {
        int answer = Integer.MAX_VALUE;
        Scanner scanner = new Scanner(System.in);
        int queueQuantity = scanner.nextInt();
        int [][] timeEstimation = new int[queueQuantity][3];
        int counter = 0;
        while (counter < queueQuantity){
            timeEstimation[counter][0] = scanner.nextInt();
            timeEstimation[counter][1] = scanner.nextInt();
            timeEstimation[counter][2] = scanner.nextInt();
            counter++;
        }
//        int tempValue = 0;
//        for (int i = 0; i < 2; i++){
//            for (int j = queueQuantity - 1; j > 0; j --){
//                timeEstimation[j][i];
//            }
//        }

        for(int i = 0; i < queueQuantity; i++){
            int timer = 0;
            int indexOfPerson = i;
            for(int j = 2; j > 0; j--){
                if(queueQuantity > (j+1)){
                    int time = timeEstimation[indexOfPerson++][j];
                    timer += time;
                }





            }

            int gg = timeEstimation[0][0] > timeEstimation[1][0] ? timeEstimation[0][0] : timeEstimation[1][0];



//            System.out.println("answer = " + answer);
//            for(int j = 2; j > 0; j--){
//                if (j + i > queueQuantity){
//                    System.out.println("continue = " + (j + i));
//                    continue;
//                }
//                tempValue += timeEstimation[i][j];
//                System.out.println("tempValue = " + tempValue);
//                if (j + i == queueQuantity){
//                    System.out.println("equal = " + (j + i) + ", answer = " + answer + ", " + "temVal = " + tempValue);
//                    if (tempValue < answer){
//                        System.out.println("temVal = " + tempValue);
//                        answer = tempValue;
//                    }
//                    continue;
//                }
//            }
        }
        System.out.println(answer);
    }
}
