import processing.core.PApplet;

public class Main extends PApplet {

    public void settings() {
        fullScreen();
    }

    public void setup() {
        final int CIRCLE_COUNT = 100;
        final int MIN_DIAMETER = 10;
        final int MAX_DIAMETER = 100;

        background(0);
        noStroke();

        for (int i = 0; i < CIRCLE_COUNT; i++) {
            int x = (int) (Math.random() * width);
            int y = (int) (Math.random() * height);
            int diameter = (int) (MIN_DIAMETER + Math.random() * (MAX_DIAMETER - MIN_DIAMETER));
            int red = (int) (Math.random() * 256);
            int green = (int) (Math.random() * 256);
            int blue = (int) (Math.random() * 256);

            fill(red, green, blue);
            ellipse(x, y, diameter, diameter);
        }
    }


    public void draw() {

    }

    public static void main(String[] args) {
        PApplet.main(Main.class);
    }
}