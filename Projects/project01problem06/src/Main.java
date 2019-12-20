import processing.core.PApplet;

public class Main extends PApplet {
    float x,y,R;
    public void settings(){
        fullScreen();
    }
    public void setup(){

    }
    public void draw(){
        background(0);
        for (int i = 0; i < 5 ; i++) {
            x = random(width);
            y = random(height);
            R = random(50,150);
            for (int j = 0; j < 2 ; j++) {
                fill(0,0,255,3);
                for (int k = 0; k < R ; k++) {
                    ellipse(x,y,k,k);
                }
            }
        }
        for (int i = 0; i < 5 ; i++) {
            x = random(width);
            y = random(height);
            R = random(50,150);
            for (int j = 0; j < 2 ; j++) {
                fill(0,255,0,3);
                for (int k = 0; k < R ; k++) {
                    ellipse(x,y,k,k);
                }
            }
        }
        for (int i = 0; i < 5 ; i++) {
            x = random(width);
            y = random(height);
            R = random(50,150);
            for (int j = 0; j < 2 ; j++) {
                fill(255,0,0,3);
                for (int k = 0; k < R ; k++) {
                    ellipse(x,y,k,k);
                }
            }
        }

    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}
