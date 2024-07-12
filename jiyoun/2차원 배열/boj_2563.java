import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[])throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int arr[][] = new int[100][100];
        int result = 0;
        for(int i=0;i<N;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());

            int K= Integer.parseInt(st.nextToken()) - 1;
            int M= Integer.parseInt(st.nextToken()) - 1;

            for(int j = K; j <K+10; j++) {
                for (int k = M; k < M + 10; k++) {
                    if (arr[k][j] != 1) {
                        result += 1;
                        arr[k][j] = 1;
                    }
                }
            }

        }
        System.out.println(result);
    }
}