import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine().toUpperCase();
        int[] alphabet = new int[26];

        int max = 0;
        for(int i = 0; i<N.length(); i++){
            alphabet[(int)N.charAt(i) - 65] += 1;

            if(alphabet[(int)N.charAt(i) - 65] > max){
                max = alphabet[(int)N.charAt(i) - 65];
            }
        }
        int cnt = 0;
        Character maxAlpha = 'a';
        for(int i = 0; i<26; i++){
            if(max == alphabet[i]){

                cnt++;
                if(cnt >= 2){
                    System.out.print("?");
                    return;
                }
                maxAlpha = (char)(i+65);
            }
        }
        System.out.print(maxAlpha);
    }
}