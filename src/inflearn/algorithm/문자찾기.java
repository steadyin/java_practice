package inflearn.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자찾기 {
    public static void main(String[] args) throws IOException {
        문자찾기 main = new 문자찾기();
        main.solution1();
    }

    private void solution1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toLowerCase();
        char c = br.readLine().toLowerCase().charAt(0);
        int result = 0;

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == c)  {
                result++;
            }
        }

        System.out.println(br);
    }
}
