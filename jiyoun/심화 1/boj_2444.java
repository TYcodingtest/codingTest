import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            System.out.print(" ".repeat(N - i));
            System.out.println("*".repeat(2 * i - 1));
        }
        for (int i = N - 1; i >= 1; i--) {
            System.out.print(" ".repeat(N - i));
            System.out.println("*".repeat(2 * i - 1));
        }
    }
}