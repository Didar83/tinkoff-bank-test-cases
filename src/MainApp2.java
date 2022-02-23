import java.util.Scanner;

public class MainApp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int destinationServer = scanner.nextInt();
        int rangeBetweenServer = scanner.nextInt();
        scanner.nextLine();
        String secureServers = scanner.nextLine();
        int startServer = 1;
        String answer = "NO";
        for(int i = 1; i < destinationServer; i += rangeBetweenServer){
            startServer += rangeBetweenServer;
            if (secureServers.length() >= startServer && secureServers.charAt(startServer-1) == '0'){
                break;
            } else if (startServer == destinationServer){
                answer = "YES";
                break;
            }
        }
        System.out.println(answer);
    }
}
