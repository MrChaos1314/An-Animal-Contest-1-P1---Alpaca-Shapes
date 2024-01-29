package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Main r = new Main();
        r.run();
    }
    
    
    int S;
    int R;

    public void run() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        S = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        System.out.print(whatIsBigger(S, R));
    }

    String circle = "CIRCLE";
    String square = "SQUARE";

    private String whatIsBigger(int s, int r){
        s = (int)Math.pow(s, 2);
        r = (int)(3.14*Math.pow(r, 2));
        
        if(s > r){
            return square;
        }
        return circle;
    }
}