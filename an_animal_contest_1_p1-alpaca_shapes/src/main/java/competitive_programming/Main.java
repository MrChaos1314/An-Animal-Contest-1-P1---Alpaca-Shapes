package competitive_programming;

public class Main {
    public static void main(String[] args) {
        Main r = new Main();
        r.run();
    }
    
    
    int S;
    int R;
    int[] inputToSplit = new int[2];

    public void run(){
        String input = input();
        String[] inputSplit = input.split(" ");
        inputToSplit[0] = Integer.parseInt(inputSplit[0]);
        inputToSplit[1] = Integer.parseInt(inputSplit[1]);
        S = inputToSplit[0];
        R = inputToSplit[1];
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