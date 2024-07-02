import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            String M = br.readLine();
            char last = '?';
            ArrayList<Character> arr = new ArrayList<Character>();
            for (int j = 0; j < M.length(); j++) {
                if (last != M.charAt(j)) {
                    if (arr.contains(M.charAt(j))) {
                        cnt--;
                        break;
                    } else {
                        arr.add(M.charAt(j));
                        last = M.charAt(j);
                    }
                }
            }
            cnt++;
        }
        System.out.print(cnt);
    }
}