import java.util.Scanner;

public class MainApp5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int trackQuantity = scanner.nextInt();
        int beatQuantity = scanner.nextInt();
        int sampleQuantity = scanner.nextInt();
        scanner.nextLine();
        int[] sampleBeat = new int[sampleQuantity];
        for(int i = 0; i < sampleQuantity; i++){
            sampleBeat[i] = Integer.valueOf(scanner.nextLine());
        }
        int [] musicSpace = new int[trackQuantity];
        for(int i = 0; i < trackQuantity; i++){
            musicSpace[i] = sampleBeat[i] > beatQuantity ? sampleBeat[i] : -1;
        }
        for(int i = 0; i < sampleQuantity; i++){
            System.out.println(musicSpace[i]);
        }
    }
}
