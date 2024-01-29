package competitive_programming;

public class Main {
    public static void main(String[] args) {
        Main r = new Main();
        r.run();
    }

    public void run(){
        System.out.println(whatIsBigger(0, 0));
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