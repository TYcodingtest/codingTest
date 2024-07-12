import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int N= 5;
        int M= 15;

        char arr[][] = new char[N][M];
        for(int i=0;i<N;i++){
            String s = br.readLine();
            for(int j=0; j<s.length(); j++){
                arr[i][j] = s.charAt(j);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                if(arr[j][i] != '\0')
                    sb.append(arr[j][i]);
            }
        }
        System.out.println(sb);
    }
}