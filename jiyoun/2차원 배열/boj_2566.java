import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int N= 9;
        int M= 9;

        int row = 0;
        int col = 0;
        int max = -1;
        for(int i=0;i<N;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){
                int n =Integer.parseInt(st.nextToken());
                if(n > max){
                    max = n;
                    row = j;
                    col = i;
                }
            }
        }
        System.out.println(max);
        col++;
        row++;
        System.out.println(col + " " + row);
    }
}