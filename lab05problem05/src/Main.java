import processing.core.PApplet;

public class Main extends PApplet {

    public void settings() {
        fullScreen();
    }

    public void setup() {
        final int CIRCLE_COUNT = 10;

        background(0);
        noStroke();

        float x = width / 2.0f;
        float y = height / 2.0f;
        float diameter = min(width, height);
        float diameterDiff = diameter / CIRCLE_COUNT;
        int red = 0;
        int redDiff = 255 / CIRCLE_COUNT;

        for (int i = 0; i < CIRCLE_COUNT; i++){
            fill(red, 0, 0);
            ellipse(x, y, diameter, diameter);

            diameter -= diameterDiff;
            red += redDiff;
        }
    }


    public void draw() {
    }

    public static void main(String[] args) {
        PApplet.main(Main.class);
    }
}