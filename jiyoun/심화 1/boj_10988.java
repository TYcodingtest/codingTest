import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();

        int i = 0;
        int j = N.length()-1;
        while(i<j){
            if(N.charAt(i) != N.charAt(j)){
                System.out.println("0");
                return;
            }
            i++;
            j--;
        }
        System.out.println("1");

    }
}