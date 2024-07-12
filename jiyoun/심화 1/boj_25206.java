import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[])throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        double result = 0;
        int num = 0;
        for(int i=0;i<20;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            st.nextToken();
            double N= Double.parseDouble(st.nextToken());
            String M= st.nextToken();
            double grade = 0;
            char temp = M.charAt(0);
            if(temp=='P')
                continue;
            num += N;
            if(temp=='F')
                continue;
            if(temp == 'A')
                grade = 4.0;
            else if(temp =='B')
                grade=3.0;
            else if(temp=='C')
                grade=2.0;
            else if(temp=='D')
                grade=1.0;
            if(M.charAt(1) == '+'){
                grade += 0.5;
            }

            result += grade*N;
        }
        System.out.println(result/num);
    }
}