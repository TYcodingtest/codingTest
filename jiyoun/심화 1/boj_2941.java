import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();

        N = N.replace("c=", "a");
        N = N.replace("c-","a");
        N = N.replace("dz=", "a");
        N = N.replace("d-","a");
        N = N.replace("lj", "a");
        N = N.replace("nj", "a");
        N = N.replace("s=", "a");
        N = N.replace("z=", "a");

        System.out.print(N.length());
    }
}